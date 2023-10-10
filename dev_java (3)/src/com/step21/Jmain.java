package com.step21;
class J1{
	//총점을 담을 변수 선언
	int tot = 0;
	//평균을 담을 변수 선언
	double avg  = 0.0;	
	void hap(int n1, int n2, int n3) {
		//int tot = 0;
		tot = n1 + n2 + n3;
	}
	void average() {
		
	}
}
public class Jmain {

	public static void main(String[] args) {
		int n1 = 80;
		int n2 = 90;
		int n3 = 70;
		//insert here
		J1 h1 = new J1();
		h1.hap(n1, n2, n3);//call by value  - 
		//H2클래스에서 결정된 전역변수 tot에 계산된 값을 출력하고 싶다.
		System.out.println(h1.tot);

	}

}
