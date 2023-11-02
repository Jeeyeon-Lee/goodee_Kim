package com.step5;

import javax.swing.JButton;
import javax.swing.JFrame;

public class M {
	JFrame jf = new JFrame();
	JButton jbtn = new JButton("조회22");
	//JButton jbtn2 = new JButton("조회");
	JButton jbtn2 = jbtn;
	public void initDisplay() {
		System.out.println(jbtn==jbtn2);//true
		jf.add("North",jbtn);//조회버튼
		jf.add("South", jbtn2);
		jf.setSize(500, 400);
		jf.setVisible(true);
	}
	public static void main(String[] args) {
		M m = new M();
		m.initDisplay();
	}
}
