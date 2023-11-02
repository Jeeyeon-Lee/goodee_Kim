package com.step8;
//원시형, 참조형(중점)
class A{
	//전변이다.
	int i;//0
	
}
public class AMain {
	//클래스 안에 정의된 함수를 자바에서는 메소드이름, javascript - function 기능 - 함수도 객체이다.
	//파라미터 
	void m(int i) {//파라미터가 원시형 타입 - 호출할때 결정됨 -call by value(2) 
		System.out.println(i);
	}
	void m(A a) {//참조형 타입 - 주소번지(a) @abcd1234.i호출가능함
		int x = a.i;
		System.out.println(x);//0
	}
	public static void main(String[] args) {
		AMain am = new AMain();
		am.m(2);
		A a = new A();//a.i, a.메소드();
		am.m(a);//call by reference -a가 값이 아니라 주소번지를 가짐
	}

}
