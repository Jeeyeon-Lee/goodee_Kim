package com.step8;
class B{
	String s = new String("hello");
	void m() {
		s = new String("world");
	}
	void m(String s) {//s는 3번의 전변과는 다르다
		this.s = s;
		System.out.println(this.s);//
		System.out.println(s);//
	}
}
public class BMain {

	public static void main(String[] args) {
		B b = new B();
		//System.out.println(b.s);//hello
		b.m();//메소드를 경유할때 재정의가 될 수 있다.
		//System.out.println(b.s);//world
		String s = new String("hello");
		b.m(s);
		b.m(new String("nice"));
	}

}
