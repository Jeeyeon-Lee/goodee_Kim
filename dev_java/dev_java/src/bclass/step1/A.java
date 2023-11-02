package bclass.step1;

public class A {
	int i;//전역변수 선언하기 - 클래스 설계
	public A() {
		System.out.println("A()호출");
		i = 10;
	}
	public A(int i) {
		//this();//this예약어로 디폴트 생성자 호출이 가능함
	}
	void methodA() {//메소드 선언 - 클래스 설계 일부
		
	}
	//해당 메소드 내에서만 유지됨 - 메소드 영역을 벗어나면 유지되지 않음
	//내부에서 처리된 결과가 한정적이다. - 인스턴스 변수에 대해서 한정됨
	//만약 외부에서 유지되기를 원하면 전변으로 치환하던가 아니면 리턴타입을 활용함
	void methodA(int i) {//메소드오버로딩 - 파라미터가 투입되었다. - 지변 - 스택메모리거주
		//인스턴스화를 할 때마다 새로운 객체가 생성됨 - 주소번지가 달라진다.
		A a = new A();
		a.i = 20;
		System.out.println(a.i);//20
	}
	public static void main(String[] args) {
		A a = new A(0);
		System.out.println(a.i);//10
	}
}
