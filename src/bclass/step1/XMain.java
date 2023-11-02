package bclass.step1;
class X{
	public static X x = new X();
	int i=0;
	private X() {}
	//메소드를 호출하여 객체생성을 받아오자
	public static X getInstance() {
		return x;
	}
}///////////////
public class XMain {

	public static void main(String[] args) {
		X x = X.getInstance() ;
		System.out.println(x.i);
	}

}
/*
1. 선언부에서 인스턴스화를 하는데 static을 붙여야 한다
2. 메소드를 호출하여 리턴타입으로 객체를 받도록 한다.
3. 사용하고자 하는 클래스에서 위 메소드를 호출하여 객체를 주입받는다.
*/