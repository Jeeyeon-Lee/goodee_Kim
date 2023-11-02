package bclass.step1;

public class Car {
	private int carNum;
	public Car() {//디폴트 생성자 - 리턴타입이 없고 , 구현없음, 생략가능, 생략했을 경우 컴파일 될때 JVM주입해줌
		int x = CarFactory.serialNum++;
		System.out.println("x: "+x);
		carNum = CarFactory.serialNum;
	}
	public int getCarNum() {
		return carNum;
	}

	public void setCarNum(int carNum) {
		this.carNum = carNum;
	}
}
