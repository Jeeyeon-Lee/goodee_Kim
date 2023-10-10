package com.step21;

class DPet{
	//변수명은 소문자
	String kind = "강아지";//전변자리 - 전역변수
	public String favorite() {
		String kind = "길냥이";
		System.out.println("제가 좋아하는 동물이에요");
		kind = "호랑이";
		return kind;
	}//end of favorite
}//end of DPet
public class Pet {
	public static void main(String[] args) {
		DPet d = new DPet();
		System.out.println(d.kind);//강아지
		String kind = "고양이";//지역변수이다.
		System.out.println(kind);//고양이
		String other = d.favorite();
		System.out.println(other);
	}
}
