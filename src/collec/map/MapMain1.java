package collec.map;

import java.util.HashMap;
import java.util.Map;
// Spring Boot- F/W
class Map1{
	//다형성을 누릴 수 있다. - 다를 수 밖에 없다. 왜냐면 Map 인터페이스이니까
	Map<String, Object> map = new HashMap<>();
	Map1(){
		System.out.println(map.size());//원본의 수 - 0이다. 아래 코드를 실행하고 나면 1로 바뀐다
		map.put("1", 1);//map.size()=1
		System.out.println(map.size());//원본의 수 - 1이다.
		System.out.println(map);//{1=1} -> JSON {"1":1, "c_name":"나신입", } -Map구조이다. -> Javascript꺼낸다
		System.out.println(map.containsKey("1"));//true
		System.out.println(map.containsKey("2"));//false
		//JSON 포맷에서 [{},{},{},,,,,, label:[{},{},{},,,,]]
	}
	Map1(int i){
		map = new HashMap<>();//새로운 객체를 생성함 - 복제본이다.(원본,복제)
		System.out.println(map.size());//복제본의 수 - 0이다.
		//map.size() =0  map을 복제하고 put호출하지 않았으므로 0이다.
	}
}
public class MapMain1 {

	public static void main(String[] args) {
		Map1 m1 = new Map1();//전변이 읽혀진다. - 디폴트 생성자가 호출되었으니까 출력이 될거야
		//insert here에서 키값이 1인 값을 출력하시오. - 인스턴스 변수 2번 오는 코드 확실하게 해둘것
		System.out.println(m1.map.get("1"));
		Map1 m2 = new Map1(50000);//15번 생성자에서 50000을 사용하고 있지 않으므로 어떤 값을 치환해도 의미 없다.

	}

}
