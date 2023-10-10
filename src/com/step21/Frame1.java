package com.step21;

import javax.swing.JFrame;

//이름은 같지만 서로 다른 메소드 이다. - 결론
public class Frame1 {
	JFrame jf = new JFrame();
	void initDisplay() {
		jf.setSize(500, 400);//상수를 사용해서 별로야
		jf.setVisible(true);//true가 상수이다.
	}
	//메소드의 파라미터 자리는 호출될 때 결정된다.
	void initDisplay(int width, int height) {//하나는 변수로 처리가 되지만 나머지는 상수로 처리함
		jf.setSize(width, height);//상수를 사용해서 별로야
		//상수를 사용했기때문에 앱이라면 음악을 듣는 중에 전화가 들어오는 상황을 상상해보면
		//기능 구현이 어렵다.
		jf.setVisible(true);//true가 상수이다.		
	}
	void initDisplay(int width, int height, boolean isView) {
		jf.setSize(width, height);//상수를 사용해서 별로야
		jf.setVisible(isView);//true가 상수이다.		
	}
	public static void main(String[] args) {
		Frame1 f = new Frame1();
		f.initDisplay(500, 400, false);//값에 의한 호출이다.- 호출될때 지역변수가 초기화가 된다.(중요)
	}

}
