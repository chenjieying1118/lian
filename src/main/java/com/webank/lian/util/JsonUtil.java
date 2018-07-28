package com.webank.lian.util;

import com.alibaba.fastjson.JSON;
import com.webank.lian.domain.User;

public class JsonUtil {
	
	public static String objToStr(Object o) {
		return JSON.toJSONString(o);
	}
	
	public static void main(String[] args) {
		User user = new User(1, "1", "1", "1", "1");
		System.out.println(JSON.toJSONString(user));
	}
}
