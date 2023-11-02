package com.step8;
class D{
	int currentPage=0;
}
public class DMain {
	//디폴트 생성자가 호출되었을때 전역변수가 존재한다면 그쪽으로 먼저 이동함
	public DMain() {
		System.out.println("default 생성자 호출");
	}
	D d = new D();//전역적으로 사용함
	void m() {
		System.out.println(d);
		d.currentPage = 3;
		System.out.println(d.currentPage);//0 -> 3
	}
	void m(D d2) {
		d2.currentPage = 2;
		System.out.println(d2.currentPage);//2
	}
	D m2(D d2) {
		d2.currentPage = 2;
		System.out.println(d2.currentPage);//2
		return new D();
	}
	D m2() {
		D d4 = new D();
		System.out.println("27:"+d4);
		System.out.println(d4.currentPage);//0
		return d4;
	}
	int m3(D d2) {
		d2.currentPage = 2;
		System.out.println(d2.currentPage);//2
		return 3;
	}
	public static void main(String[] args) {
		//지역변수이더라도 파라미터 자리를 이용하면 다른 외부메소드에서
		//사용이 가능하다.
		D d2 = new D();//지역적으로 사용함		- 위치가 다르다
		DMain dm = new DMain();
		dm.m(d2);
		D d3 = dm.m2(d2);
		System.out.println(d3==d2);//true
		System.out.println(d3);
		System.out.println(d2);
		D d4 = dm.m2();
		System.out.println("47"+d4);//46번라인 d4랑 26번라인 d4같니?
	}
}
