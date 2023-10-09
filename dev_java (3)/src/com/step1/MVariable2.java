package com.step1;

public class MVariable2 {
	//여기 - 전변자리
	void methodA() {

	}
	public static void main(String[] args) {
		//메소드 내부에서 선언된 변수는 지역변수라서 methodA에서는 사용불가
		MVariable2 m1 = new MVariable2();
	}
////////
}
