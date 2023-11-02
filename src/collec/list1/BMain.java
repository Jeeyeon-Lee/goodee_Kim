package collec.list1;
class B{
	int i =1;
	void m() {
		int j =1;
		B b = new B();//인스턴스화 - 코드로 만들어진 클래스를 메모리에 로딩함 - new예약어
		System.out.println(b.i);//전역변수만 인스턴스변수명.i로 사용가능함
		System.out.println(j);//전역변수만 인스턴스변수명.i로 사용가능함
	}
	int m(int i) {
		int j =1;
		return j;
	}	
}
public class BMain {

	public static void main(String[] args) {
		B b = new B();
		b.m();
		int x = b.m(10000);//1
		System.out.println(b.m(10000));//
		int hap = x+2;
		
	}

}
