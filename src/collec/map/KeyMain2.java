package collec.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//소셜로그인 구현,  카카오 우편번호 검색,  카카오페이 도전
public class KeyMain2 {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(new Integer(1), "85");//autoboxsing 원시형 int Integer
		map.put(2, "75");
		map.put(3, "65");
		Object names[] = null;
		//names.length
		//System.out.println(names.length);
		Set<Integer> set = map.keySet();
		names = set.toArray();
		//메소드의 리턴타입이 오브젝트 일 수 있다.
		//변수명.메소드명().메소드명()
		Object[] its = map.keySet().toArray();
		its = set.toArray();
		for(Object obj:its) {
			System.out.println(obj);
		}
		System.out.println("=================================");
		System.out.println(names.length);
		for(int i=0;i<names.length;i++) {
			Integer key = (Integer)names[i];
			System.out.println(key);
		}
	}

}
