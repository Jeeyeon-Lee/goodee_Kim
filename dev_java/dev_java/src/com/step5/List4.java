package com.step5;

import java.util.ArrayList;
import java.util.List;

public class List4 {
	List<DeptDTO> li = new ArrayList<>();//확장성, 유지보수할때 코스 수정 양을 줄여줌 - 실전예제 - 오라클
	//스프링에서 JPA로 DB 연동을 할땐 -Hibernate 자동처리시(쿼리문이 없는데 DB연동됨- 자바클래스로 데이터셋 설계)
	//List<Map<String,Object>>로  한다(특히 조인(둘 이상의 테이블 연결해서조회-업무가 복잡할수록)하는 업무 내용일 때 사용함)
	//쿠키(only String)와 세션(자료구조 섞어씀)-hard함
	public static void main(String[] args) {
		List4 l4 = new List4();
		DeptDTO  dept = new DeptDTO();
		dept.setDeptno(10);
		dept.setDname("영업부");
		dept.setLoc("부산");
		l4.li.add(dept);
		dept = new DeptDTO();
		dept.setDeptno(20);
		dept.setDname("개발부");
		dept.setLoc("대전");
		l4.li.add(dept);
		System.out.println(l4.li);//[]
		DeptDTO rd = l4.li.get(0);
		System.out.println(rd.getDeptno()+", "+rd.getDname()+", "+rd.getLoc());//[]
		rd = l4.li.get(1);
		System.out.println(rd.getDeptno()+", "+rd.getDname()+", "+rd.getLoc());//[]
	}

}
