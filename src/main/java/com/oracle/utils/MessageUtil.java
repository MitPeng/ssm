package com.oracle.utils;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import org.apache.http.HttpResponse;
import org.apache.http.util.EntityUtils;

public class MessageUtil {
	public static String getMessage(String phone) {
	    String host = "https://feginesms.market.alicloudapi.com";
	    String path = "/codeNotice";
	    String method = "GET";
	    String appcode = "42f2531a0d224580bec968872103c420";
	    Map<String, String> headers = new HashMap<String, String>();
	    //�����header�еĸ�ʽ(�м���Ӣ�Ŀո�)ΪAuthorization:APPCODE 83359fd73fe94948385f570e3c139105
	    headers.put("Authorization", "APPCODE " + appcode);
	    Map<String, String> querys = new HashMap<String, String>();
	    Random rd = new Random();
		int message = rd.nextInt(100000);
	    querys.put("param", message+"");
	    querys.put("phone", phone);
	    querys.put("sign", "1");
	    querys.put("skin", "1");


	    try {
	    	/**
	    	* ��Ҫ��ʾ����:
	    	* HttpUtils���
	    	* https://github.com/aliyun/api-gateway-demo-sign-java/blob/master/src/main/java/com/aliyun/api/gateway/demo/util/HttpUtils.java
	    	* ����
	    	*
	    	* ��Ӧ�����������
	    	* https://github.com/aliyun/api-gateway-demo-sign-java/blob/master/pom.xml
	    	*/
	    	HttpResponse response = HttpUtils.doGet(host, path, method, headers, querys);
	    	//System.out.println(response.toString());
	    	//��ȡresponse��body
	    	System.out.println(EntityUtils.toString(response.getEntity()));
	    } catch (Exception e) {
	    	e.printStackTrace();
	    }
		return message+"";
	}
}
