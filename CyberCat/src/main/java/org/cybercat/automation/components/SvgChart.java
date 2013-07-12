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
package org.cybercat.automation.components;

import org.cybercat.automation.PageObjectException;
import org.cybercat.automation.browsers.Browser;
import org.cybercat.automation.components.AbstractPageObject.PathType;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;


public class SvgChart extends PageElement{
	
    private Dimension size;
    
    public SvgChart(String name, PathType type, String path) {
        super(name, type, path);
    }
    
    @Override
    public void initWebElement(Browser browser) throws PageObjectException {
        super.initWebElement(browser);
        setBrowser(browser);
        setSize();
    }
    
    public void setSize(){
    	size = getElement().getSize();
    }
    
    public int getHeight(){
    	return size.getHeight();
    }
    
    public int getWidth(){
    	return size.getWidth();
    }
    
    public void dragAndDrop(Point from, Point to){

        // since dragAndDrop in selenium works like piece of ... we should split drag and drop
        browser.getActions()
    			.moveToElement(getElement(), from.getX(), from.getY())
    			.clickAndHold()
    			.moveByOffset(to.getX(), to.getY()).perform();
        browser.getActions()
    			.release()
    			.perform();
    }
    
}
