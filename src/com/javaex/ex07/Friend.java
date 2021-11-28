package com.javaex.ex07;

public class Friend {

	//필드
    private  String name;
    private  String hp;
    private  String school;
    
    //생성자

    
    // 메소드 getter/setter
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getHp() {
		return hp;
	}


	public void setHp(String hp) {
		this.hp = hp;
	}


	public String getSchool() {
		return school;
	}


	public void setSchool(String school) {
		this.school = school;
	}
    
    
	//메소드 일반
    public void showInfo(){
        System.out.println("이름:"+this.name+"  핸드폰:"+this.hp+"  학교:"+this.school);
    }


}
