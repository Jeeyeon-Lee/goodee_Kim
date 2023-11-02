package jdbc.oracle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Vector;

public class List1 {

	public static void main(String[] args) {
		//List li2 = new List();//인터페이스와 추상클래스는 단독으로 인스턴스화 불가함
		Map<String,Object> map = new HashMap<>();
		System.out.println(map);//0
		List li = new ArrayList();//li.size()=0  다형성 - 세련된 표현식 - 유지보수시 코드수정 적게 해줌
		System.out.println(li);//[]
		System.out.println(li.size());//0
		li.add(map);//li.size() =1 -> [{}] 대괄호- List, {} - Map -> JSON -> 하이브리앱(web+app)
		System.out.println(li.size());//1
		map.put("b_no", 1);
		map.put("b_title", "자바의 정석");
		System.out.println("===================================");
		//서로 다른 이종간에 연계처리시 서로 만나는 부분에 대한 추가 처리코드가 필요함
		//DataSet,(비벼지는 부분- 자바코드추가(List, DataSet초기화하는 부분)필요함-> 투비소프트제공함) List, Map
		System.out.println(li instanceof List);//넥사크로화면+자바오라클연동(List,Map)
		System.out.println(li instanceof ArrayList);//
		System.out.println("===================================");
		System.out.println(map);//0
		System.out.println(map.get("b_author"));//null
		System.out.println(map.get("b_price"));//null
		//제네릭을 사용하지 않으면 타입을 체크하여 형전환을 개발자가 직접 해야한다.
		int b_price = (int)map.get("b_price");// VO와 Map 제네릭으로 선택했을 때 차이점 인지
		b_price = (int)map.get("b_author");
		System.out.println(b_price);
		li = new Vector();
		li = new LinkedList();
		List<Map<String,Object>> li2 = new ArrayList<>();

	}

}
