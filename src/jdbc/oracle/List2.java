package jdbc.oracle;

import java.util.List;
import java.util.Map;

public class List2 {
	void methodA(List<BookVO> bookList) {
		// 사용권 -  나신입 - 로그인 - 권한
		BookVO bVO = new BookVO();//b_no, b_title, b_author, b_price - private - thread가 관리함 List<ChatServerThread>
		//bVO.b_title ="수학의정석";
		bVO.setB_title("수학의정석");
		bVO.setB_author(null);
		System.out.println(bVO.getB_title().length());//수학의정석 - 5
		System.out.println(bVO.getB_author());//null
		System.out.println(bVO.getB_author().length());//NullPointerException
		//System.out.println(null.length());//수학의정석 - NullPointerException
		//System.out.println("".length());//수학의정석
		// 사용권 - 나초보
		bVO = new BookVO();//LifeCycle   -   생성 -  호출 - 죽임(메모리 회수-캔디데이트상태-gc)
		System.out.println(bVO.getB_title().length());
	}
	void methodB(List<Map<String,Object>> bookList) {
		
	}
	public static void main(String[] args) {
		List2 list2 = new List2();
		list2.methodA(null);

	}

}
