package com.javaex.ex08;

public class Account {

    private String accountNo;
    private int balance;
    
    //생성자 작성
    public Account() {
    	
    }
    
    public Account(String accountNo) {
    	this.accountNo=accountNo;
    }
    
    public Account(String accountNo, int balance) {
    	this.accountNo=accountNo;
    	this.balance=balance;
    }

    
    //메소드
    
	public int deposit(int money) {
		this.balance=balance+money;
		return balance;
	}
	
	public int withdraw(int money) {
		this.balance=balance-money;
		return balance;
	}
	
	public void showBalance() {
		System.out.println(this.balance);
	}
	
	//메소드 일반
	public void showInfo() {
		System.out.println(accountNo+" 계좌가 개설되었습니다.");
	}
    
    
    

}
