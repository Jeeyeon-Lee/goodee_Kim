package bclass.step2;
//싱글톤으로 객체를 주입(메소드 리턴타입으로 객체를 주입받는 경우) 받는 경우 만일 변수가 필요하다면
//전역변수도 static으로 해야 하는걸까? 아니면 non-static이어도 상관없는가?
class B{
	int i=1;
	//POJO프레임워크 만들어보기
	//이른인스턴스화를 하였다.
	static B b = new B();//전변의 자리이다. 인스턴스화를 하면 접근할 수  있다.
	//생성자의 접근제한자를 private으로 하여 제약을 건다 - 외부에서 호출이 불가함
	private B() {
		
	}
	//인스턴스변수를 사용할 수  없(왜냐면 생성자앞에 private)으니 메소드선언시 static을 붙인다.
	//클래스변수.createB()호출한다.
	//선언부에 전변의 이름앞에도 static을 붙여서 return 변수 b에 컴파일 에러를 해결하였다.
	//
	public  static B createB() {
		return b;//전역변수이니까 다른 메소드에서도 재사용이 가능하다.
	}
}
public class BMain {
	int i =1;//전변 i를 스캔하는 시점이 BMain 이 인스턴스화(생성) 되었을 때
	public static void main(String[] args) {
		B bs[] = new B[3];
		B b = B.createB();
		System.out.println(b.i++);//출력을 먼저 하고 출력한 뒤에 1씩 증가 시킨다. - 후위 연산자이니까
		bs[0] =b;
		b = B.createB();
		System.out.println(b.i++);
		bs[1] =b;
		b = B.createB();		
		System.out.println(b.i++);
		bs[2] =b;
		for(B b1:bs) {
			System.out.println(b1);
		}
	}

}
