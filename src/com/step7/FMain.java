package com.step7;
class F{
	String name = null;
}
public class FMain {
	//파라미터 자리는 지변성격, 그래서 선언만  가능함.
	void m(String name) {
		System.out.println(name);
	}
	public static void main(String[] args) {
		FMain fm = new FMain();
		String name = new String("나신입");
		fm.m(name);
	}

}
