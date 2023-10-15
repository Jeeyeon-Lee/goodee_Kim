package com.step5;

import java.util.ArrayList;

public class List2 {

	public static void main(String[] args) {
		ArrayList fruits = new ArrayList();//토마토 사과 딸기
		fruits.add("🍅");
		fruits.add(1,"🍓");
		fruits.add(1,"🍎");
		String r1 = (String)fruits.remove(1);
		System.out.println(fruits);//["","",""]
		System.out.println(r1);
	}

}
