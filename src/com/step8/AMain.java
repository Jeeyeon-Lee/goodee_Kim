package com.step8;
//������, ������(����)
class A{
	//�����̴�.
	int i;//0
	
}
public class AMain {
	//Ŭ���� �ȿ� ���ǵ� �Լ��� �ڹٿ����� �޼ҵ��̸�, javascript - function ��� - �Լ��� ��ü�̴�.
	//�Ķ���� 
	void m(int i) {//�Ķ���Ͱ� ������ Ÿ�� - ȣ���Ҷ� ������ -call by value(2) 
		System.out.println(i);
	}
	void m(A a) {//������ Ÿ�� - �ּҹ���(a) @abcd1234.iȣ�Ⱑ����
		int x = a.i;
		System.out.println(x);//0
	}
	public static void main(String[] args) {
		AMain am = new AMain();
		am.m(2);
		A a = new A();//a.i, a.�޼ҵ�();
		am.m(a);//call by reference -a�� ���� �ƴ϶� �ּҹ����� ����
	}

}
