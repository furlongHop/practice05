package com.javaex.ex02;

public class Goods {

	//필드
	private String name;
	private int price;
	
	//생성자
	public Goods() {
		//오류의 이유: 새로운 생성자를 만들 경우 원래 존재하던 기본 생성자는 사라진다.
		//오류가 난 코드는 기본 생성자를 사용하던 코드이므로 기본 생성자도 사용하고 싶은 경우에는 직접 만들어주면 오류가 해결된다.
	}
	
	public Goods(String name, int price) {
		this.name=name;
		this.price=price;
	}

	
	//메소드 g/s
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	
	
	//메소드 일반
	public void showInfo() {
		System.out.println("상품명: "+name+", 가격: "+price);
	}
	
	
}




