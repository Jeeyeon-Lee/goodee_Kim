package bclass.step1;

import javax.swing.JButton;

public class EMain extends Object {
	@Override
	public String toString() {
		return "null";
	}
	public static void main(String[] args) {
		EMain em = new EMain();
		JButton jbtn = new JButton("조회");
		System.out.println(em);
		System.out.println(em.toString());
		System.out.println(jbtn);
	}

}
