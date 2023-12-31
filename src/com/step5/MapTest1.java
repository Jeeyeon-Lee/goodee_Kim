package com.step5;

import java.util.HashMap;
import java.util.Map;

public class MapTest1 {

	public static void main(String[] args) {
		//선언부와 생성부의 타입을 다르게 인스턴스화 하기 - 다형성
		//선언부(추상클래스 or 인터페이스 or 구현체클래스)- 고급, 세련됨
		//Hashtable(멀티스레드안전), HashMap(싱글안전)
		//List보다 속도 빠름 -  milisec - 순서가 없다. - 2차 가공이 필요없다
		Map<String, String> map = new HashMap<>();
		map.put("deptno", "10");
		map.put("dname", "영업부");
		map.put("loc", "부산");
		System.out.println(map.get(10));
		System.out.println(map.containsKey(10));//false
		System.out.println(map.containsKey("deptno"));//true
		System.out.println(map.containsKey("Deptno"));//false - 대문자라서 
		System.out.println(map.containsKey("deptno1111"));//false - 숫자가 붙어서
		if(map.containsKey(10)) {
			System.out.println("키가 있어요");
		}
		else {
			System.out.println("키가 없어요");			
		}
	}
}
