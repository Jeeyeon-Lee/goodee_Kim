package com.step7;
class E{
	int i=1;
}
public class EMain {
	void m(int i) {
		System.out.println(i);//1
	}
	void m(E e) {
		System.out.println(e.i);//5
	}
	public static void main(String[] args) {
		EMain em = new EMain();
		E e = new E();
		em.m(e.i);
		e.i = 5;
		em.m(e);
	}
}
