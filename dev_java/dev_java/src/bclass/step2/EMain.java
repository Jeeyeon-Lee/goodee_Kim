package bclass.step2;
// EMain is a E
class E{
	E(){
		System.out.println("E()");
	}
	void m() {
		
	}
}

public class EMain extends E{
	EMain(){
		System.out.println("EMain()");
	}

	void m(int i) {//메소드 오버로딩으로 합법
		
	}
	public static void main(String[] args) {
		new EMain();

	}

}
