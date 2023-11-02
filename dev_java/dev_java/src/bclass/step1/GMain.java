package bclass.step1;
class G{
	int i = 1;
	static int j = 10;
	G(){
		j++;
		i = j;
	}
}
public class GMain {
//여러개의 인스턴스가 하나의 전변을 공유하고 싶다면 static한다
	public static void main(String[] args) {
		G g = new G();
		System.out.println(g);
		System.out.println(g.i);
		System.out.println(G.j+1);
		g = new G();
		System.out.println(g);
		System.out.println(g.i);
		System.out.println(G.j+1);
		g = new G();
		System.out.println(g);
		System.out.println(g.i);
		System.out.println(G.j+1);
	}
}
