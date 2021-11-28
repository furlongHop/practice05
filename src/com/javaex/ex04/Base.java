package com.javaex.ex04;

public class Base {
 
	//메소드
    public void service(String state) {
    	if(state=="낮") {
    		System.out.println("낮에는 열심히 수업듣자");
    	}else if(state=="밤") {
    		System.out.println("밤에는 숙면");
        }else if(state=="오후") {
        	System.out.println("오후도 낮과 마찬가지로 공부해야 합니다.");
    	}else {
    		System.out.println("");
    	}
     }
    
    /*
     출력 코드가 있어야 하는 곳은 service 메소드. 넣어진 값이 문자열이므로 String으로
     조건식을 이용해 값을 출력했다.
     */
}

