package com.step7;
//인스턴스화 하기   A  a = new A();
// A a = null;  다른 곳에서  a = new A();해보기
//
class A{
	int ival;//0 -  원시형 - 호출하면 값이 나옴
	String s = null;//참조형
	String s1 = new String();
	A(){
		s = new String("나신입");		
	}
	A(int i){
		s = new String("나초보");		
	}
}
public class AMain {

	public static void main(String[] args) {
		A a = new A(0);
		System.out.println(a.ival);//0
		System.out.println(a.s);//null or 나신입
	}

}
