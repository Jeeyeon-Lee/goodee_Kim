package com.step8;
class B{
	String s = new String("hello");
	void m() {
		s = new String("world");
	}
	void m(String s) {//s�� 3���� �������� �ٸ���
		this.s = s;
		System.out.println(this.s);//
		System.out.println(s);//
	}
}
public class BMain {

	public static void main(String[] args) {
		B b = new B();
		//System.out.println(b.s);//hello
		b.m();//�޼ҵ带 �����Ҷ� �����ǰ� �� �� �ִ�.
		//System.out.println(b.s);//world
		String s = new String("hello");
		b.m(s);
		b.m(new String("nice"));
	}

}
