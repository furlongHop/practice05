package com.javaex.ex09;

public class StringUtilApp {

    public static void main(String[] args) {

    	//파라미터↓                    전달인자↓
        String[] strArray = {"SuperMan", "BatMan", "SpiderMan"};
        String resultStr = StringUtil.concatString(strArray);
        
        System.out.println("결과 문자열:" + resultStr);
    }

}
