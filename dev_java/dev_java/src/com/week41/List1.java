package com.week41;

import java.util.ArrayList;
//List인터페이스의 구현체 클래스다
public class List1 {

	public static void main(String[] args) {
		int a[] = new int[3];
		a = new int[5];
		ArrayList al = new ArrayList();
		al.add("키위");
		al.add(1,"토마토");
		al.add(1,"딸기");
		al.add("수박");
		al.add(3,"바나나");
		String fruit = (String)al.get(3);
		System.out.println(al.size());
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
		ArrayList<String> al2 = new ArrayList<>();
		ArrayList<Integer> al3 = new ArrayList<>();
		al2.add("키위");
		al2.add(1,"토마토");
		al2.add(1,"딸기");
		String fruit2 = al2.get(2);
		for(int i=0;i<al2.size();i++) {
			System.out.println(al.get(i));
		}
		System.out.println(fruit2);
		String fruit3 = "🍎";
		System.out.println(fruit3);
	}

}
