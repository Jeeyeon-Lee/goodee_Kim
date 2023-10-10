package com.step21;
class H1{
	//총점을 담을 변수 선언
	int tot = 0;
	//평균을 담을 변수 선언
	double avg  = 0.0;
}
class H2{
	H1 h1 = new H1();//복사본
	//
	int hap(int n1, int n2, int n3) {
		//int tot = 0;
		h1.tot = n1 + n2 + n3;
		return h1.tot;
	}
	void average() {
		
	}
}
public class Hmain {

	public static void main(String[] args) {
		int n1 = 80;
		int n2 = 90;
		int n3 = 70;
		//insert here
		H1 h1 = new H1();
		H2 h2 = new H2();
		int tot = h2.hap(n1, n2, n3);//call by value  - 
		//H2클래스에서 결정된 전역변수 tot에 계산된 값을 출력하고 싶다.
		System.out.println(tot);

	}

}
