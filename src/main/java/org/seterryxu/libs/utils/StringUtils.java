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

package org.seterryxu.libs.utils;

import java.io.PrintWriter;
import java.io.StringWriter;

/**
 * Some useful string utilities for CI-related tools,plugins,etc.
 * 
 * @author Xu Lijia
 * 
 */
public final class StringUtils {

	public static boolean isValid(String str) {
		if (str == null || str.trim().equals("")) {
			return false;
		}

		return true;
	}

	public static boolean isValid(String[] strs) {
		if (strs == null || strs.length == 0) {
			return false;
		}

		return true;
	}

	public static boolean isUrl(String url) {
		if (isValid(url) && url.startsWith("http://")) {
			return true;
		} else {
			return false;
		}
	}

	public static String transformToUrl(String url) {
		if (isValid(url)) {
			StringBuilder urlBuilder = new StringBuilder(url);
			if (!url.startsWith("http://")) {
				urlBuilder.insert(0, "http://");
			}

			if (!url.endsWith("/")) {
				urlBuilder.append("/");
			}

			return urlBuilder.toString();
		} else {
			return null;
		}
	}

	/**
	 * Output Throwable object into string.
	 */
	public static String getStrackTrace(Throwable t) {
		StringWriter writer = new StringWriter();
		PrintWriter printWriter = new PrintWriter(writer);

		t.printStackTrace(printWriter);
		StringBuffer buffer = writer.getBuffer();
		return buffer.toString();
	}

	public static String camelize(String name) {
		if (isValid(name)) {
			return Character.toLowerCase(name.charAt(0)) + name.substring(1);
		}

		return null;
	}
}
