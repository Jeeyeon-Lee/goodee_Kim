package bclass.step1;
class C1{
	int i;
}
class C2{
	
}
public class CMain {
	//c1은 C1타입이고 아직 생성되지 않았다. 선언만 함. 아직 인스턴스화 안함
	C1 c1 = null;//타입이 결정된것도 아니었다 - 경험치
	public static void main(String[] args) {
		CMain cm = new CMain();
		cm.c1 = new C1();//생성
		System.out.println(cm.c1);//null
		System.out.println(cm.c1 instanceof C1);
		System.out.println(cm.c1.i);//NullPointerException발동됨
		System.out.println(cm.c1.i+2);//2
		System.out.println("main");
	}
}/////// end of CMain
