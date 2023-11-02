package com.step51;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class T1Main {

	public static void main(String[] args) {
		List<Map<String, Object>> li = new ArrayList<>();
		System.out.println(li.size());//0
		Map<String, Object> map = new HashMap<>();
		map.put("deptno",10);
		map.put("dname","영업부");
		map.put("loc","부산");
		li.add(map);// li.size()0-> 1
		System.out.println(map.size());//0-> 3 - 키값의 가지 수
		//키값이 존재하지 않으면 null출력한다. 리턴한다
		System.out.println(map.get("deptno"));//
		/*
		 * System.out.println(map.get(map)+","+dept.dname+","+dept.loc); dept.deptno =
		 * 10; dept.deptno = 20; dept.dname = "영업부"; dept.loc = "부산"; //제네릭을 수정한 시점이
		 * add한 다음이더라도 원본을 변경함 li.add(dept);//li.size() => 0-> 1
		 * System.out.println(dept.deptno+","+dept.dname+","+dept.loc); dept = new
		 * Dept2(); dept.dname = "개발부"; li.add(dept);//li.size() => 1-> 2
		 * System.out.println(li); for(int i=0;i<2;i++) { Dept2 dept1 = li.get(i);
		 * System.out.println(dept1.deptno+","+dept1.dname+","+dept1.loc); }
		 */
	}

}
