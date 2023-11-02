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
		D d = new D();//지역적인 성격을  다른 메소드 에서 사용하고 싶을땐 파라미터를 사용할것
		d.i = 500;//500
//		System.out.println(d.i);		
		dm.effectParam(d);
		System.out.println(d.i);//500		
	}

}
