package com.step21;
class A{
	//첫번째 학생 점수를 담을 변수 선언
	//전변은 유지 된다.- A a = new A(); a = null;(다시 초기화-디폴트값-모른다, 결정되지않음) a = new A();
	//미묘한 문제가 발생됨 - 재생성을 했다 - 복사본이 한 개 더 만들어졌다. 이전에 참조하던 클래스는 날아갔다.
	int n1 = 70;
	int n2 = 80;
	int n3 = 90;
	int tot = 0;
	void hap1() {//처리하기 부른다. - 리턴타입 void-> int, 또는 전변을 굳이 지변(파라미터자리)으로 처리하기
		//tot는 지변이라서 다른 외부의 클래스 에서는 사용이  불가하다. - 문제제기 - 재사용성이 떨어짐 코드임
		int tot = n1 + n2 + n3;//이것을 JVM에게 시킨다.
		//원시형 타입은 한 번에 한가지의 값만 담김 - 만일 여러번 하면 덮어쓰기가 되는 것임
		this.tot = tot;//0-> 240
	}
}
public class Amain {

	public static void main(String[] args) {
		A a  = new A();
		System.out.println(a.n1);
		//insert here - 위치 -  기초가 아니다
		//아래 메소드 호출이 되어야 13번 라인이 실행 기회를 가짐
		//메소드를 선언할 때는 좌중괄호와 우중괄호로 끝남
		a.hap1();//메소드가 호출될때는 세미콜론으로 끝난다.
		System.out.println(a.tot);//tot는 지변이라서 외부의 다른 클래스에서 재사용이 불가함

	}

}
/*
 생각하기 - 말하기(녹음, 끄적임) - 낱말카드 작성 - class A{}
 main메소드가 필요한 클래스인가? -> 전변선언- 타입과 갯수 결정할 수  있나? - 판단, 기준
세 학생의 점수를 입력 받아서...... -> 변수 3개가 필요하다 -> 타입은 뭘로 할까? -> 전변으로 할까?|지변으로 해도 되나
전변 -  초기화 생략가능함,  하나의 클래스를 대표하는 값이다.(인스턴스변수.변수명)


*/