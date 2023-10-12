package com.step5;

public class DeptDTO {
	private int deptno;
	private String dname;
	private String loc;
	private EmpDTO empDTO;
	public EmpDTO getEmpDTO() {
		return empDTO;
	}
	public void setEmpDTO(EmpDTO empDTO) {
		this.empDTO = empDTO;
	}
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
}
