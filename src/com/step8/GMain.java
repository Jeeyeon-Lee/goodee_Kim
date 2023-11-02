package com.step8;

import javax.swing.JButton;
import javax.swing.JFrame;

class G{
	JFrame jf = null;
	JButton jbtn = null;
	G(){
		if(jf !=null) {
			initDisplay();
		}
		else {
			System.out.println("jf가 널인 상태라서 initDisplay()호출해도 에러가 발생할거야");
		}
	}
	G(String title){// 메소드 오버로딩
		jf = new JFrame();
		//jbtn = new JButton("조회");
		jf.setTitle(title);
		initDisplay();		
	}
	public void initDisplay() {	
		jf.add("North",jbtn);
		jf.setSize(500, 400);
		jf.setVisible(true);
	}
}
public class GMain {
	public static void main(String[] args) {
		G g = new G("");
	}

}
