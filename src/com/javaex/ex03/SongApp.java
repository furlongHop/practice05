package com.javaex.ex03;

public class SongApp {

	public static void main(String[] args){
		
	 
		Song s1 = new Song("좋은날","아이유","Real","이민수","2010",3);
		
		/*
		결과 예상: 변수가 6개이므로 6개를 포함한 생성자를 사용할 것이다.
		그러나 6개짜리 생성자가 5개짜리 생성자를 호출하고 있으므로 결국 사용되는 생성자는 총 두 개다.
		따라서 5개짜리 생성자와 6개짜리 생성자가 포함하고 있는 출력값 2개가 나올 것이다.
		*/
	}

}


