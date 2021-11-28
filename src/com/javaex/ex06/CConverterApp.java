package com.javaex.ex06;


public class CConverterApp {

    public static void main(String[] args) {

//        double dollar;
//        double won;
        
        CConverter.setRate(1118.70);
        
        //100만원을 달러로 출력하기
        double am=CConverter.toDoller(1000000);
        System.out.println("백만원은 "+am+"달러입니다.");
        
        //100달려를 원으로 출력하기
        double kr=CConverter.toKWR(100);
        System.out.println("백달러는 "+kr+"입니다.");
        
        
        /*
         static에 올려두고 사용할 경우 새로 공간을 만들 필요가 없다.
         따라서 클래스 속 메소드를 호출하여 직접 값을 입력한다.
         이때 주소를 모르므로 출력을 위한 이름을 임의로 지어 불러낼 필요가 있다. 
         */
    }

}
