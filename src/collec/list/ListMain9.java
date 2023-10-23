package collec.list;
/*
 * 제네릭을 VO나 Map으로 선택하는 건 JSON형식에 사전 준비 작업이다.
 * 공공포털이나 회사들이 자신들의 서버를 공개하지 않는대신 요청에 대한 검색 결과를 JSON으로 제공한다.
 * List<VO> -> JSON,  JSON -> List<VO> , List<Map>바꾸어 쓸 수 있다.
입력 - add(element):boolean -> 응답처리시 선택, add(int, element):void -> 응답처리시 부적합
리턴타입이 boolean이라서 처리 결과에 대한 응답을 받아 볼 수 있다(보이지 않는걸 확인해줌)
메소드 선택시 기준이 될 수 있다. - 리턴타입이 있고 없고가 기준에 영향이 있다.
:사용자 정의 메소드를 설계할 때 리턴타입을 반드시 고려 하시오. - 안전한 코드를 작성하기위해
제네릭을 반드시 정한다. - 직관적이다. - 담는 사람도 꺼내는 사람도 기억할 수 없다.
그런데 서비스는 기억(알림설정, 메시지 푸쉬- 서비스)해준다.
수정 - set(int, element):Element(=Object) : 내가 추가한 것을 그대로 반환해준다.
상세보기
전체보기
삭제
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

class List9{
	//원시형타입에서 참조형(XXXVO, Map)으로 제네릭을 바꾸었다.
	List<String> rank = new ArrayList<>();//rank.size()=0
	void init() {//전역변수의 선언된 깡통에 3가지 정보를 추가하기
		rank.add(0,"나신입");
		rank.add(1,"나초보");
		rank.add(2,"나일등");
		//rank.add(3,"입력한 이름");
	}
	//아래 코드가 실행되면 
	//전역변수이면 어차피 동기화가 된다. - 하나이다 - static
	//단 최초에는 빈통이니까 3명의 명단을 출력하려면 init()경유시킬것.- 전처리 - 출력전에 먼저 init()호출 할것.
	void rankSelect() {//형 왜 리턴타입을 void로 바꾸는 건가요? - 전역변수이잖아
		System.out.println(rank);
	}
	//자료구조에 들어있는 값을 순회하는데 get(int)메소드의 리턴타입이 Element인 것을
	//사용자 정의메소드를 구현하여서 굳이 리턴타입을 boolean으로 바꾸어본다.(if문 복습하기)
	//한건 조회하기 ->  조건식이 필요하니까 파라미터가 필요하고 전체 조회일땐  있는 거 모두 출력이니까 파라미터가 필요없잖아
	boolean rankDetail(int index) {
		boolean isOk = false;
		String name = null;
		//insert here
		name = rank.get(index);
		System.out.println("찾는 이름은  "+name+" 입니다.");
		if(name!=null) {
			isOk = true;
		}
		return isOk;
	}
}
public class ListMain9 {
	public static void main(String[] args) {
		System.out.println("전체조회 	1번을 입력하고 상세조회이면 2번을 입력하시오.");
		Scanner sc = new Scanner(System.in);//화면을 그리진 않지만 화면이 갖는 효과는 누릴 수 있다.
		List9 l4 = new List9();
		l4.init();
		//for(int i=0;i<5;i++) {
		while(true) {
			String menu = "-1";//-1 : End of file
			menu = sc.nextLine();
			if("1".equals(menu)) {
				System.out.println("1번 전체조회를 선택하셨습니다.");
				l4.rankSelect();
				//return;//메인메소드를 빠져나간다.
				continue;
			}
			else if("2".equals(menu)) {
				System.out.println("2번 상세조회를 선택하셨습니다.");
				System.out.println("상세조회를 원하는 번호를 입력하세요.");
				String user = sc.nextLine();
				System.out.println("상세보기를 원하는 번호는 "+user + " 입니다.");
				int index = Integer.parseInt(user);
				if(index>=0) {
					l4.rankDetail(index);
				}
				//return;
				continue;
			}
			else if("q".equals(menu)) {
				//return;
				System.out.println("프로그램을 종료합니다.\n");
				System.exit(0);
			}
		}
	}//////////// end of main
}/////////////// end of ListMain8
