package collec.list;

public class ThreeDPrinterTest {

	public static void main(String[] args) {
		Powder p = new Powder();
		ThreeDPrinter3 tp3 = new ThreeDPrinter3();
		//아래 코드에서 파라미터 이슈가 발생되지 않는건 Object이기 때문이다.
		tp3.setMaterial(p);
		// 타입을 잘못 맞추면 ClassCastingException이 발동할 수 있다.- 멈춘다.
		//이걸 잘 못 맞춘 개발자가 예외처리를 했을까? 
		 Powder p1 =(Powder)tp3.getMaterial();
	}

}
