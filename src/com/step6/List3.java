package com.step6;

import java.util.ArrayList;
import java.util.List;
class Sonata{
	int wheelNum = 4;
	String carColor = "핑크";
	int speed = 0;
}
public class List3 {
	List<Sonata> li = new ArrayList<>();
	List<Integer> li2 = new ArrayList<>();
	List<String> li3 = new ArrayList<>();
	public void shop() {
		Sonata s = new Sonata();
		li2.add(s.wheelNum);
		li3.add(s.carColor);
		//li.add(0,"소보로");
	}
	public static void main(String[] args) {
		List3 list3 = new List3();
		list3.shop();
		System.out.println(list3.li.size());
		for(int i=0;i<list3.li2.size();i++) {//li.size()=0
			System.out.println("여기"+list3.li2.get(i));
		}
		for(int i=0;i<list3.li3.size();i++) {//li.size()=0
			System.out.println("여기"+list3.li3.get(i));
		}
	}

}
