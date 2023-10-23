package collec.list;
//사용자 정의 제네릭 구현하기
public class GenericMaterial<A> {
	private A material;

	public A getMaterial() {
		return material;
	}

	public void setMaterial(A material) {
		this.material = material;
	}
}
/*
	자료형 매개변수 T<type parameter> : 이 클래스를 사용되는 시점에서  실제 사용할
	자료형이 결정된다.(컴파일 타임에 JVM 바꿔치기를 해준다)
	단 static변수형은 사용 불가함- 약속 - 컨벤션
	GenericMaterial은 제네릭의 자료형이다.
	T라는 대체 문자를 사용하였다.
*/