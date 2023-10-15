package com.step5;

import java.util.ArrayList;

public class EmpManager {
	 ArrayList<EmpDTO> empList = new ArrayList<>();//아무것도 없다 size() =0
	void getEmpList() {
		System.out.println(empList.size());//0
		EmpDTO emp = new EmpDTO(7566,"나신입", "영업", 7500, "2000-10-20",3000,500,10);//000000nullnullnull
		empList.add(0,emp);
		emp = new EmpDTO();//변수명은 같지만 주소번지가 다르다.
		empList.add(1,emp);
		System.out.println(empList.size());//2
		for(int i=0;i<empList.size();i++) {
			EmpDTO remp = empList.get(i);
			System.out.println(remp.getEmpno()+", "+remp.getEname()+", "+remp.getHiredate());
		}
	}
	public static void main(String[] args) {
		//자기자신을 인스턴스화 해야만 전역변수의 인식됨
		EmpManager em = new EmpManager();
		em.getEmpList();
	}

}
