package com.step7;
class F{
	String name = null;
}
public class FMain {
	//�Ķ���� �ڸ��� ��������, �׷��� ����  ������.
	void m(String name) {
		System.out.println(name);
	}
	public static void main(String[] args) {
		FMain fm = new FMain();
		String name = new String("������");
		fm.m(name);
	}

}
