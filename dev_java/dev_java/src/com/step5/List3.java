package com.step5;

import java.util.ArrayList;

public class List3 {
	void getFruitList(ArrayList<String> fruits) {
		for(int i=0;i<fruits.size();i++) {
			System.out.println(fruits.get(i));// 0 1 2
		}
	}
	ArrayList<String> methodA(){
		ArrayList<String> fruits = new ArrayList<>();//토마토 사과 딸기
		fruits.add("🍅");
		fruits.add(1,"🍓");
		fruits.add(1,"🍎");
		return fruits;
	}
	public static void main(String[] args) {
		List3 li = new List3();
		ArrayList<String> fruits = li.methodA();
		System.out.println(fruits);//"["","",""]" -> Map {}
	}

}
