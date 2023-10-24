package collec.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import collec.list1.CustomerVO;
// Spring Boot- F/W
class Map4{
	//다형성을 누릴 수 있다. - 다를 수 밖에 없다. 왜냐면 Map 인터페이스이니까
	Map<String, CustomerVO> map = new HashMap<>();
	Map4(){
		CustomerVO cvo = new CustomerVO();
		cvo.setC_name("나신입");
		cvo.setC_id(10);
		cvo.setC_birthday("2005-09-11");
		map.put("1", cvo);//map.size()=1
	}
	void mapDelete() {
		map.remove("1");
	}
}
public class MapMain4 {
	public static void main(String[] args) {
		Map4 m = new Map4();
		System.out.println(m.map);
		Set<Map.Entry<String,CustomerVO>> entrySet = m.map.entrySet();
		Iterator<Map.Entry<String,CustomerVO>> entryIterator = entrySet.iterator();
		while(entryIterator.hasNext()) {
			Map.Entry<String, CustomerVO> entry = entryIterator.next();
			String key = entry.getKey();//String타입임
			CustomerVO cvo = entry.getValue();
			System.out.println(key+", "+cvo);
		}
		System.out.println("===========[[ 삭제 후 ]]============");
		//m.mapDelete();
		m.map.clear();
		System.out.println(m.map);
	}
}
