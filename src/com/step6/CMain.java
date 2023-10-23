package com.step6;
class C{
	int ival = 1;
	C(){
		ival = 2;
	}
	C(int ival){
		this.ival = ival;
	}
	void methodA() {
		//ival = 1;
		//C c = new C();
		//c.ival = 1;
		System.out.println(ival);//ival = 1출력되게 코드를 수정해 보시오.
	}
}
public class CMain {
	public CMain() {
		C c = new C(1);
		c.methodA();
	}
	public static void main(String[] args) {
		CMain cm = new CMain();
	}
}
