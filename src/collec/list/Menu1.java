package collec.list;

import java.util.Scanner;

public class Menu1 {

	public static void main(String[] args) {
		//9번이 for문 안에 있는것과 for문 밖에 있는 것의 차이는 무엇입니까?
		//임의의 숫자를 채번하는 그런 함수라면 씨앗이 되는 값이 필요하다.
		//채번하는데 있어서 빈도수에 관련이 있으니까 변하면 안된다.
		//임의의 값을 채번할때 씨앗이 되는 값이 계속 변경되어야하는 룰이면
		//for문 안에 있어야 한다.
		Scanner sc = new Scanner(System.in);
		System.out.println("전체조회 	1번을 입력하고 상세조회이면 2번을 입력하시오.");
		//for(int i=0;i<5;i++) {
		while(true) {
			String menu = "-1";//-1 : End of file
			menu = sc.nextLine();
			if("1".equals(menu)) {
				System.out.println("1번 전체조회를 선택하셨습니다.");
				//return;//메인메소드를 빠져나간다.
				continue;
			}
			else if("2".equals(menu)) {
				System.out.println("2번 상세조회를 선택하셨습니다.");
				//return;
				continue;
			}
			else if("q".equals(menu)) {
				//return;
				System.out.println("프로그램을 종료합니다.\n");
				System.exit(0);
			}
		}
		//여기서 변수 j에 접근이 가능하다|아니다.
		//Menu1 m1 = new Menu1();
		//System.out.println(m1.j);
	}
}
