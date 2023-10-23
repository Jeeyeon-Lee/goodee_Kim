package com.step6;

import java.util.ArrayList;
import java.util.List;

public class List2 {
	List<String> li = new ArrayList<>();
	public void shop() {
		li.add("소보로");
		li.add(0,"소보로");
	}
	public static void main(String[] args) {
		List2 li2 = new List2();
		//li2.shop();
		System.out.println(li2.li.size());
		for(int i=0;i<li2.li.size();i++) {//li.size()=0
			System.out.println("여기"+li2.li.get(i));
		}
	}

}
