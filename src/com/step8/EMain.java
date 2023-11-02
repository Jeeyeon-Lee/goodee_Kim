package com.step8;
//리턴타입 언제? 어떻게 쓴다
//파라미터를 언제사용하고 어떤 역할을 가질 수 있나?
class E{
	int i;
}
public class EMain {
	E e = null;
	void m() {
		e = new E();
		System.out.println(e.i);
		e = null;
	}
	void m2() {
		System.out.println(e.i);		
	}
	public static void main(String[] args) {
		EMain em = new EMain();
		em.m();
		//위에 메소드 호출이 아래 메소드 결과에 영향이 있다 - 부정적임
		em.m2();
	}

}
