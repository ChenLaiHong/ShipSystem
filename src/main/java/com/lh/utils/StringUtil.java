package com.lh.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class StringUtil {

	public static boolean isEmpty(String str) {
		if (str == null || "".equals(str.trim())) {
			return true;
		} else {
			return false;
		}
	}


	public static boolean isNotEmpty(String str) {
		if ((str != null) && !"".equals(str.trim())) {
			return true;
		} else {
			return false;
		}
	}


	public static String formatLike(String str) {
		if (isNotEmpty(str)) {
			return "%" + str + "%";
		} else {
			return null;
		}
	}

	//截取字符串
	//str={"time":"2020-04-08","value":"大锅饭"}
	public static String[] noteStr(String str){
		String[] result = new String[2];
		String[] idsStr = str.split("\"");
		result[0] = idsStr[3];
		result[1] = idsStr[7];
		return result;
	}

	
}
