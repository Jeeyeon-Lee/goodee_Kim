package com.step1;
class M{
	//클래스 선언 바로 뒤에 변수를 선언하면 전변이다.
	int i = 10;
	void methodA() {
		 int i = 5;//애는 MVariable1클래스에서 접근이 불가함
		 M m = new M();
		 System.out.println(m.i);
	}
}
public class MVariable1 {
	//여기 - 전변자리
	void methodA() {
		//여기서 사용할래요
		M m  = new M();
		System.out.println(m.i);//인스턴스변수.변수명으로 호출할 수 있는건 전변이다.
	}
	public static void main(String[] args) {
		//메소드 내부에서 선언된 변수는 지역변수라서 methodA에서는 사용불가
		MVariable1 m1 = new MVariable1();
		m1.methodA();

	}
////////
}
