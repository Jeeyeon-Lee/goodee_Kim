package collec.list;

public class GenericMaterialTest {

	public static void main(String[] args) {
		Powder p = new Powder();
		Plastic pt = new Plastic();
		GenericMaterial<Powder> tp3 = new GenericMaterial<>();
		GenericMaterial<Plastic> tp4 = new GenericMaterial<>();
		//아래 코드에서 파라미터 이슈가 발생되지 않는건 Object이기 때문이다.
		tp3.setMaterial(p);
		tp4.setMaterial(pt);
		// 타입을 잘못 맞추면 ClassCastingException이 발동할 수 있다.- 멈춘다.
		//이걸 잘 못 맞춘 개발자가 예외처리를 했을까? 
		 Powder p1 =tp3.getMaterial();
		 Plastic p2 = tp4.getMaterial();
		 System.out.println(p1.toString());//나는 파우더 입니다.
		 System.out.println(p2.toString());//나는 플라스틱 입니다.
	}

}
