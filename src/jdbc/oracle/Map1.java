package jdbc.oracle;

import java.util.HashMap;
import java.util.Map;

public class Map1 {
	Map<String,Object> map = null;//map 은 한개로우만 담는다.- myBatis(SQL 오픈소스-생산성-코딩양30%줄어듦)
	//컬럼 하나만도 담을 수 있다.
	//전변 map에 대해서 초기화 해 보시오.
	void methodA() {
		//insert here
		map = new HashMap<>();
		map.put("b_title", "자바의 정석");
		map.put("b_author", null);
		map.put("b_price", 30000);
	}
	void methodAPrint() {
		if(map!=null) {
			System.out.println(map.get("b_title"));
			System.out.println(map.get("b_author"));
			System.out.println(map.get("b_price"));			
		}else {
			System.out.println("조회할 수 없습니다.");
		}
		
	}
	void methodB(Map<String,Object> pmap) {
		
	}
	Map<String,Object> methodC(Map<String,Object> pmap) {
		Map<String,Object> rmap = null;
		return rmap;
	}
	public static void main(String[] args) {
		Map1 m1 = new Map1();
		m1.methodA();
		m1.methodAPrint();
	}

}
