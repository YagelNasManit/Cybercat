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

package org.cybercat.automation.test;

import org.cybercat.automation.core.Platform;

/**
 * Marker interface showing that component that implements it assumes using version control system.
 * 
 * @author Ubegun
 */
public interface IVersionControl {
    
    /**
     * Returns version number for version control engine 
     */
    public int getVersion();

    public Platform[] getPlatforms();

    public boolean isSupportsPlatform(Platform platform);
}
