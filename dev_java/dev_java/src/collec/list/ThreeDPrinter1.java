package collec.list;
//제네릭을 사용한다는 건 주소번지를 두번 접근해야 값에 도달함
//데이터셋 역할을 하는 클래스 설계에 대한 이해가 필요하다.
//Spring Boot - DB연동을 직접하지 않는다.(DML을 사용하지 않는다.) - 그런데 DB연동은 된다.
//자동으로 해준다. - Hibernate - 데이터베이스의 테이블 관계를 클래스 설계로 처리하기때문에 
//쿼리문이 없이도 DB연동이 가능하다. oak
public class ThreeDPrinter1 {
	private Powder material;

	public Powder getMaterial() {
		return material;
	}

	public void setMaterial(Powder material) {
		this.material = material;
	}
}
