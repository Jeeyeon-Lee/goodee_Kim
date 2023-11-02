package com.step8;

import javax.swing.JFrame;

//리턴타입 언제? 어떻게 쓴다
//파라미터를 언제사용하고 어떤 역할을 가질 수 있나?
class F{
	String s = new String("hello");//String은 클래스중 유일하게 원시형처럼 호출하면 값이 출력됨
	JFrame f = new JFrame("전자계산기");
	void m(String s) {
		//인스턴스화가 완성되는 시점에 따라서 실행되기도 하고 안될 수도 있다.
		//s = new String("world");
		System.out.println(s);//world
	}
}
public class FMain {

	public static void main(String[] args) {
		FMain fm = new FMain();
		F f = new F();
		f.m(new String("hi"));
	}

}
