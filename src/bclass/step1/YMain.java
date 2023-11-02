package bclass.step1;
class Y{
	
}
public class YMain {

	public static void main(String[] args) {
		
		Y ys[] = new Y[3];
		for(int i=0;i<ys.length;i++) {
			//Y y = new Y();
			//ys[i] = y;
			System.out.println(ys[i]);
			
		}
		Y y = new Y();
		System.out.println(y);
		//ys[0] = y;
		System.out.println(ys[0]);
		System.out.println(y);
		System.out.println(ys[0]);//null
		System.out.println(ys[1]);//null
		System.out.println(ys[0] == y);
		y = new Y();
		ys[1] = y;
		System.out.println(ys[1]);

	}

}
