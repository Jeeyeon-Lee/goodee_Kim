package com.week3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyCalcEvent implements ActionListener{
	MyCalcView myCalcView = null;//여기서 new하면 안됨 - 복제본이 만들어지니까
	//연산자(+) 누르기 전에 입력된 값 담기
	String v1 = "";//calcurate에서 필요함
	//연산자(=) 누르고 난 뒤에 입력된 값 담기
	String v2 = "";
	//연산자 담기(+,-,*,%)
	String op = "";	
	public MyCalcEvent(MyCalcView myCalcView) {
		this.myCalcView = myCalcView;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();
		if("1".equals(command)) {//너 숫자 1 버튼 누른거야?
			//전처리하기 - 맨앞에 0이 있는 경우 전처리함
			if("0".equals(myCalcView.jtf_display.getText())) {
				myCalcView.jtf_display.setText("");
			}
			myCalcView.jtf_display.setText(myCalcView.jtf_display.getText()+"1");
		}
		else if("2".equals(command)) {//너 숫자 2 버튼 누른거야?
			//전처리하기 - 맨앞에 0이 있는 경우 전처리함
			if("0".equals(myCalcView.jtf_display.getText())) {
				myCalcView.jtf_display.setText("");
			}
			myCalcView.jtf_display.setText(myCalcView.jtf_display.getText()+"2");			
		}
		else if("+".equals(command)) {//너 + 버튼 누른거야?
			System.out.println("더하기 버튼");
			//insert here - v1담기
			v1 = myCalcView.jtf_display.getText();
			System.out.println("v1 : "+ v1);
			op = "+";
			myCalcView.jtf_display.setText("");
		}
		else if("=".equals(command)) {//너 = 버튼 누른거야?
			System.out.println("계산 결과는 얼마");			
			//insert here - v2담기
			v2 = myCalcView.jtf_display.getText();
			String result = myCalcView.mcLogic.calcurate(v1, v2, op);
			myCalcView.jtf_display.setText(result);
		}		
		else if("<=".equals(command)) {//너 = 버튼 누른거야?
			System.out.println("한글자씩 지우기 구현");		
		}		
		else if("C".equals(command)) {//너Clear 버튼 누른거야?
			myCalcView.jtf_display.setText("");	
		}		
	}//////////////////////// end of actionPerformed /////////////////////////////

}
