package com.step5;

import java.util.ArrayList;
import java.util.List;

class Z{
	Z(){
		System.out.println("Z()호출성공");
	}
}
public class ZMain {

	public static void main(String[] args) {
		List<Z> li = new ArrayList<>();
		List li2 = new ArrayList();
		Z z = new Z();
		li.add(z);
		li2.add(z);
		System.out.println(z);
		z = new Z();
		li.add(z);
		li2.add(z);
		System.out.println(z);
		System.out.println(li);
		System.out.println(li2);
		Z z1 = (Z)li2.get(0);
		Z z2 = li.get(0);
	}

}
