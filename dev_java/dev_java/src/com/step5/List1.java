package com.step5;

import java.util.ArrayList;

public class List1 {

	public static void main(String[] args) {
		String s1 = null;
		String s2 = null;
		String s3 = null;
		ArrayList<String> fruits = new ArrayList<String>();
		boolean isOk = fruits.add("🍅");
		System.out.println(isOk);
		s1 = fruits.get(0);
		fruits.add(1,"🍓");
		s2 = (String)fruits.get(1);
		fruits.add(1,"🍎");
		s3 = (String)fruits.get(2);
		for(int i=0;i<fruits.size();i++) {
			System.out.println(fruits.get(i));//토마토,사과,딸기
		}
		System.out.println(s1+", "+s2+", "+s3);
	}

}
