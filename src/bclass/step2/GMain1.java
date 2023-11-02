package bclass.step2;

import java.util.StringTokenizer;

class G1{
	String s = null;
	public void init() {
		s = new String("300#apple");
	}
}
public class GMain1 {

	public static void main(String[] args) {
		G1 g = new G1();
		g.init();
		StringTokenizer st = new StringTokenizer(g.s,"#");
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());
		System.out.println(g.s);
	}

}
