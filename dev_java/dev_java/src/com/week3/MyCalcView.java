package com.week3;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyCalcView {
	//전역변수에 선언되어 있어도 해당 클래스를 인스턴스화 하지 않으면 생성자 호출이 안됨(꼭 기억하자)
	MyCalcLogic mcLogic = new MyCalcLogic(this);//this-MyCalcView
	MyCalcEvent mcEvent = new MyCalcEvent(this);
	JFrame jf = new JFrame();
	JTextField jtf_display = new JTextField("0");
	JPanel jp = new JPanel();
	JButton jbtnOne = new JButton("1");
	JButton jbtnTwo = new JButton("2");
	JButton jbtnPlus = new JButton("+");
	JButton jbtnEqual = new JButton("=");
	JButton jbtnBack = new JButton("<=");
	JButton jbtnClear = new JButton("C");
	
	public void initDisplay() {
		jtf_display.setHorizontalAlignment(JTextField.RIGHT);
		//이벤트 처리를 담당하는 핸들러 클래스의 인스턴스변수를 준다.
		jbtnOne.addActionListener(mcEvent);
		jbtnTwo.addActionListener(mcEvent);
		jbtnPlus.addActionListener(mcEvent);
		jbtnEqual.addActionListener(mcEvent);
		jbtnBack.addActionListener(mcEvent);
		jbtnClear.addActionListener(mcEvent);
		jp.add(jbtnOne);
		jp.add(jbtnTwo);
		jp.add(jbtnPlus);
		jp.add(jbtnEqual);
		jp.add(jbtnBack);
		jp.add(jbtnClear);
		jf.add("North",jtf_display);
		jf.add("Center",jp);
		jf.setSize(400, 400);
		jf.setVisible(true);
	}	
	
	public static void main(String[] args) {
		MyCalcView mcv = new MyCalcView();
		mcv.initDisplay();
	}

}
