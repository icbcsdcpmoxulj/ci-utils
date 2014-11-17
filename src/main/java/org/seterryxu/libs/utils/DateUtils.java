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

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Xu Lijia
 * 
 */
public final class DateUtils {

	private static SimpleDateFormat dateFormatter = new SimpleDateFormat(
			"yyyy-MM-dd_HH-mm-ss");

	private static SimpleDateFormat dateFormatter2 = new SimpleDateFormat(
			"yyyy-MM-dd HH:mm:ss");
	
	public static Date toDate(String buildId){
		try {
			return dateFormatter.parse(buildId);
		} catch (ParseException e) {
			StringUtils.getStrackTrace(e);
			return null;
		}
	}
	
	/**
	 * @return yyyy-MM-dd_HH-mm-ss
	 */
	public static String toString(Date date){
		return dateFormatter.format(date);
	}
	
	/**
	 * @return yyyy-MM-dd HH-mm-ss
	 */
	public static String toString2(Date date){
		return dateFormatter2.format(date);
	}
	
	
	
}
