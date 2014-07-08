/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

//      Contributors:      Xu Lijia 

package ci.xlj.libs.utils;

import java.io.File;

public class ConfigUtils {

	public static File getConfigFile(String jobDirPath) {
		String configPath = jobDirPath + File.separator + "config.xml";

		File config = new File(configPath);
		if (config.exists() && config.canRead()) {
			return config;
		} else {
			return null;
		}
	}
}
