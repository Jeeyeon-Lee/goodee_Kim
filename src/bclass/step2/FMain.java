package bclass.step2;
//어려운 수학문제를 푼다 -> 일상 일어나는 일 - 상상 - 코드 표현해 본다.
import java.util.StringTokenizer;

class F{
	//생성해서 사용하고 나서 필요없으면 삭제한다. - 객체의 라이프 사이프 사이클 - 생성-활용-소멸
	String s = null;//선언과 생성을 따로 한다.
	public void init() {
		s = new String("200|kiwi|tomato|오늘뭐해?");//메소드 오버로딩 규칙을 적용함 - 생성자에도 동일하게 적용됨
	}
	public void service() {
		System.out.println("service");
		//생성자 첫번째 파라미터가 null이라서 StringTokenizer도 생성이 안된다.
		StringTokenizer st = new StringTokenizer(s,"|");//생성자에 파라미터가 여러개도 가능한가 보다
		System.out.println(st);
		st.nextToken();//200
		String from = st.nextToken();//kiwi
		System.out.println(from);
	}
	public void destroy() {
		if(s!=null) {//너 집 있구나- 효과적인 처리 - 일양을 줄여준다.
			s = null;
		}
	}
}
public class FMain {

	public static void main(String[] args) {
		F f = new F();
		//초기화를 하지 않으니까 뒤에 NullPointerException발생할 수도 있어
		f.init();
		//메소드 호출 순서도 프로그램이 실행될 때 문제를 일으킬수도 있다. - 메소드 호출하는 위치도 중요함
		//s를 무조건 null로 치환하지 않고 if문에서 null인지 유무를 따져보고 null인 경우만 22번을 경유하게 하였다. 왜냐면 불필요한 일을 중복시킬  필요는 없으니까
		f.destroy();
		f.service();
		System.out.println(f.s);//Hello

	}

}
