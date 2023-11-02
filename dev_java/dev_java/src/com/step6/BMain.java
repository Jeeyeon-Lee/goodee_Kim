package com.step6;
class B{
	int ival;
	B(){
		System.out.println("B()");
	}
}
public class BMain {
	//선언부 - 전변성격
	B b = new B();
	public static void main(String[] args) {
		BMain bm = new BMain();
		System.out.println("main"+ bm.b.ival);
	}

}
