package com.step21;
class G1{
	int i;//전역변수 - 디폴트값 - 0
	void methodA() {
		i = i + 1;
	}
}

public class Gmain {

	public static void main(String[] args) {
		//인스턴스변수.전역변수이름호출이 가능하다.
		G1 g1 = new G1();
		g1.methodA();
		System.out.println(g1.i);//0 -> 1
		
	}

}
