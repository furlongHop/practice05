package com.javaex.ex07;

import java.util.Scanner;

public class FriendApp {

    public static void main(String[] args) {

    	
    	// 클래스배열의 선언
        Friend[] friendArray = new Friend[3];
        Scanner sc = new Scanner(System.in);

        // 클래스배열의 각 항목별 생성-->개체를 메모리로 로딩
        for(int i=0; i<3; i++) {
        	friendArray[i] = new Friend();
        }
        
        String name;
        String hp;
        String school;
        
        System.out.println("친구를 3명 등록해 주세요");

         for(int i=0;i<3;i++) {
        	 System.out.print("이름:");
        	 name=sc.nextLine();
        	 System.out.print("핸드폰: ");
        	 hp=sc.nextLine();
        	 System.out.print("학교: ");
        	 school=sc.nextLine();
        	 System.out.println("---------------------------------");
        	 
        	 // Class Array Object의 필드에 setter를 이용해 각 필드값을 저장한다.
        	 friendArray[i].setName(name);
        	 friendArray[i].setHp(hp);
        	 friendArray[i].setSchool(school);
           
         }   
        
        for (int i = 0; i < friendArray.length; i++) {
        	// Class Array Object의 필드값을 읽어와 출력하는 구문
            friendArray[i].showInfo();
        }

        sc.close();
    }

}
