package com.step1;

public class Double3 {

	public static void main(String[] args) {
		int i = 1;
		//정수는 실수에 담을 수 있다.
		double d = 3.14;//2.0
		//강제형전환시에는 0.14는 int타입에 담을 수 없다
		i = (int)d;//왜 에러지?//2 - 여기서 괄호는 캐스팅 연산자라 부름 - 강제형전환
		System.out.println(i);//3
		System.out.println(d);//3.14

	}

}
