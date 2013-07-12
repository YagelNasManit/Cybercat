/**Copyright 2013 The Cybercat project
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 *     
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.cybercat.automation.core;

import java.util.Collections;
import java.util.Locale;
import java.util.Set;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.cybercat.automation.AutomationFrameworkException;
import org.cybercat.automation.PageFactory;
import org.cybercat.automation.PageObjectException;
import org.cybercat.automation.browsers.Browser;
import org.cybercat.automation.browsers.Browser.Browsers;
import org.cybercat.automation.components.AbstractPageObject;
import org.cybercat.automation.components.AbstractPageObject.PathType;
import org.cybercat.automation.components.processor.AbstractProcessor;
import org.openqa.selenium.Cookie;
import org.springframework.context.ApplicationContext;

/**
 * Creates and initializes page classes that extend AbstractPageObject
 */
public class PageFactoryImpl implements PageFactory {

    private static Logger LOG = Logger.getLogger(PageFactoryImpl.class);

    /**
     * Spring application context
     */
    private ApplicationContext context;
    /**
     * Basic url with which page classes work Can be changed through property file and/or Page.Object.Context.xml See
     * block of creating page objects in Page.Object.Context.xml
     */
    private String baseUrl;

    /**
     * Instance of current browser
     */
    private Browser browser;
    
    public PageFactoryImpl(String baseUrl) throws AutomationFrameworkException {
        super();
        this.baseUrl = baseUrl;
    }

    protected void setup(AutomationMain mainFactory, ApplicationContext context) throws PageObjectException {
        if (this.context == null || this.browser == null || this.browser.isClosed()) {
            this.context = context;
            Browsers eBrowser = Browsers.valueOf(mainFactory.getProperty("browser.name"));
            this.browser = mainFactory.createBrowser(eBrowser);
            if (this.baseUrl != null) {
                this.browser.get(baseUrl);
            }
        }
    }

    /**
     * Initializes and returns page class instance
     * 
     * @param page
     *            - page class
     * @throws PageObjectException
     */
    protected <T extends AbstractPageObject> T initPage(T page) throws PageObjectException {
        String finalUrl = baseUrl;
        // get locators
        Locale locale;
        try {
            locale = new Locale(AutomationMain.getMainFactory().getProperty("language"));
        } catch (AutomationFrameworkException e) {
            throw new PageObjectException("Main factory initialization exception.", e);
        }

        if (page.getBaseUrl() != null) {
            finalUrl = page.getBaseUrl();
        }
        finalUrl = StringUtils.isBlank(page.getPageUrl()) ? finalUrl + page.getPageUrl() : page.getPageUrl();

        try {
            LOG.info("Current URL: " + browser.getCurrentUrl());
            if (page.isRedirectByUrl() && !browser.getCurrentUrl().contains(finalUrl)) {
                LOG.info("Navigate to URL: " + finalUrl);
                browser.get(finalUrl);
            }
            page.setPageFactory(this);
            page.init(browser, locale);
            LOG.info(page.getClass().getName() + " page created.");
        } catch (Exception e) {
            throw new PageObjectException("Unable initialize " + page.getClass().getName() + " page by URL: " + finalUrl, e);
        }
        return page;
    }

    /**
     * Returns base url
     */
    public String getBaseUrl() {
        return baseUrl;
    }

    /**
     * Returns current URL
     */
    public String getCurrentUrl() {
        if (browser == null)
            return null;
        return browser.getCurrentUrl();
    }

    /**
     * Defines base url & current browser to direct by this URL
     */
    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
        if (this.browser != null)
            this.browser.get(baseUrl);
    }

    /**
     * Returns processor creating WebElements according to predefined type
     * 
     * @param type
     *            - type is defined depending on addressing type to html pages elements (xpath, css name, id, name)
     */
    public <T extends AbstractProcessor> T createElementProcessor(PathType type) {
        @SuppressWarnings("unchecked")
        T result = (T) context.getBean(type.toString());
        return result;
    }

    /**
     * Closes all browsers
     */
    public void closeBrowser() {
        if (browser != null) {
            LOG.warn(">>> Close browser");
            browser.quit();
        }
    }

    @Override
    public Set<Cookie> getCookies() {
        if (browser == null)
            return Collections.emptySet();
        return browser.getCookies();
    }

    @Override
    public Browser getBrowser() {
        return browser;
    }

    @Override
    public <T extends AbstractPageObject> T createPage(Class<T> page) throws PageObjectException {
        return context.getBean(page);
    }

    @Override
    public <T extends AbstractPageObject> T createPage(Class<T> page, boolean isRedirectToUrl) throws PageObjectException {
        T pageObject = context.getBean(page);
        pageObject.setRedirectByUrl(isRedirectToUrl);
        return null;
    }
}
