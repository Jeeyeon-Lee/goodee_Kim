package com.step7;
class D{
	int i;
}
public class DMain {
	void effectParam(D d){
		//d = new D();
		d.i = 100;
		System.out.println(d.i);//0->100
	}
	public static void main(String[] args) {
		DMain dm = new DMain();
		D d = new D();//�������� ������  �ٸ� �޼ҵ� ���� ����ϰ� ������ �Ķ���͸� ����Ұ�
		d.i = 500;//500
//		System.out.println(d.i);		
		dm.effectParam(d);
		System.out.println(d.i);//500		
	}

}
