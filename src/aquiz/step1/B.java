package aquiz.step1;
//메소드 오버라이딩은 선언부를 건드리지 않는다.
class A {
	public byte getNumber() {//shadow method
		return 1;
	}
}

class B extends A {
	@Override
	public byte getNumber() {
		return 2;
	}

	public static void main(String args[]) {
		A b = new B();
		System.out.println(b.getNumber());
	}
}
