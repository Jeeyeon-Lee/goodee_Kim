package com.step7;
class BVO{
	private int i;
	private String name;
	private boolean isOk;
	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i = i;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isOk() {
		return isOk;
	}
	public void setOk(boolean isOk) {
		this.isOk = isOk;
	}
}
public class BMain {

	public static void main(String[] args) {
		BVO bvo = new BVO();
		bvo.setI(1);
		System.out.println(bvo.getI());//0-> 1
		System.out.println(bvo.isOk());//0-> 1
		System.out.println(bvo.getName());//0-> 1

	}

}
