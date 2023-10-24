package collec.map;

public class Sonata extends Car {

	@Override
	public void display() {
		// TODO Auto-generated method stub

	}
	public void other() {
		System.out.println("Sonata other메소드 호출");
	}
	//상속 - 컨벤션 - 상속관계에 있는 API를 어떻게 보는가?
	public void stop() {
		System.out.println("Sonata stop 호출");
		speed = speed -2;
	}
	public static void main(String[] args) {
		
		//myCar타입의 변수로  과연 Sonata클래스에 정의된 메소드를 호출할 수 있다|없다.
		Car myCar = new Sonata();
		//myCar = new Car();
		//myCar는 Car클래스 타입이라서 Car에도 있고 Sonata에도 있는 메소드만 호출가능함
		//그렇다면 양쪽에 다 있다면 누가 호출될까요 - 부모가 쥔 메소드는 쉐도우 메소드가 된다.- 호출이 불가함
		//메소드 오버라이딩이다
		//myCar.other();
		myCar.stop();
		Sonata himCar = new Sonata();
		himCar.other();
		//누가 더 많은 변수와 메소드를 누릴 수  있나요? - Sonata
	}
}
