package com.step51;

import java.util.ArrayList;
import java.util.List;

class Dept2{
	int deptno;
	String dname;
	String loc;
}
public class TMain {

	public static void main(String[] args) {
		List<Dept2> li = new ArrayList<>();
		System.out.println(li.size());//0
		Dept2 dept = new Dept2();
		System.out.println(dept.deptno+","+dept.dname+","+dept.loc);
		dept.deptno = 10;
		dept.deptno = 20;
		dept.dname = "영업부";
		dept.loc = "부산";
		//제네릭을 수정한 시점이 add한 다음이더라도 원본을 변경함
		li.add(dept);//li.size() => 0-> 1
		System.out.println(dept.deptno+","+dept.dname+","+dept.loc);
		dept = new Dept2();
		dept.dname = "개발부";
		li.add(dept);//li.size() => 1-> 2
		System.out.println(li);
		for(int i=0;i<2;i++) {
			Dept2 dept1 = li.get(i);
			System.out.println(dept1.deptno+","+dept1.dname+","+dept1.loc);
		}
	}

}
