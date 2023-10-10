package com.step1;

class Duck{
	int leg = 2;
	public void swimming() {
		System.out.println("모든 오리는 물위에 뜬다");
	}
}

public class MDuck {

	public static void main(String[] args) {
		Duck myDuck = new Duck();
		System.out.println(myDuck.leg);//2
		myDuck.swimming();
	}

}
