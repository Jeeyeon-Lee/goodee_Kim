package com.step1;

class Truck{
	int speed = 0;
	public void speedUp() {
		System.out.println("엑셀을 밟았어요");
		speed = speed + 1;
	}
}
public class MTruck {

	public static void main(String[] args) {
		Truck myCar = new Truck();
		myCar.speedUp();
		myCar.speedUp();
		myCar.speedUp();
		System.out.println(myCar.speed);

	}

}
