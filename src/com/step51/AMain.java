package com.step51;
class A1{
	public A1() {}
	public A1(AMain aMain) {
		System.out.println("A1: "+aMain);
	}

	int i;
	
}
class A2{
	public A2() {}
	public A2(AMain aMain) {
		System.out.println(aMain);
	}
	void methodA() {
		System.out.println("methodA()호출");
	}
}
public class AMain {
	A1 a1 = new A1(this);//this는 AMain타입이다
	A2 a2 = new A2(this);
	public static void main(String[] args) {
		AMain am = new AMain();
		// TODO Auto-generated method stub
		A1 a1 = new A1();
		System.out.println(a1.i);
		A2 a2 = new A2();
		a2.methodA();

	}

}
