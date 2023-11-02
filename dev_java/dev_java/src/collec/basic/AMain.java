package collec.basic;

import java.util.ArrayList;
import java.util.List;
//int-> wrapper클래스 이름  Integer(변수와 메소드를 소유할 수있다)
//인스턴스화 -> 클래스 -> 추상클래스와 인터페이스 -> 생성자 호출 -> 파라미터 자리( 변수)
class A{
	List<Integer> nums = new ArrayList<>();
	int ival;
	String s = null;
	String s1 = new String();
	//같은 이름의 생성자를 여러개 갖는다. - 메소드 오버로딩 - 파라미터타입이나 갯수가 달라야 한다. 
	A(){
		s = new String("나신입");
	}
	A(int ival){
		s = new String("나초보");
	}
	A(String name){
		s = new String(name);
	}
	A(int i, String name){
		s = new String(name);
	}
}
public class AMain {

	public static void main(String[] args) {
		System.out.println("main호출");//A클래스의 전변들은 읽혀졌을까? 아니, 아뇨, 절대 -> 인스턴스화(A)
		String s = null;
		s ="나신입";
		A a = new A(1,s);
		//a.s = "나신입";
		System.out.println(a.s);//나신입을 출력하고 싶어요. 어떡하죠?
		//생성자의 파라미터 자리(메소드오버로딩)를 활용하여 문제를 해결해 보세요.
		System.out.println(s.length());//null
	}

}
