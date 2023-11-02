package bclass.board;
// 자유게시판 구현에 대한  클래스 설계
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
// BoardView -> BoardController -> BoardDao
public class BoardView extends JFrame implements ActionListener {
	BoardController boardController = null;//나는 내 타입도 몰라요. 왜냐면 초기화를 null로 했으니까
	JButton  jbtn_sel = new JButton("조회");
	public BoardView() {
		initDisplay();
	}
	public void initDisplay() {
		jbtn_sel.addActionListener(null);//this는 현재 메모리에 로딩(활성화)되어 있는 자신 - BoardView - actionPerformed - 메소드 오버라이딩 - 추상메소드 - 인터페이스 - ActionListener - 정의가 안되어있다 - 미정이다. - 단말기가 결정되지 않음 
		this.add("North", jbtn_sel);
		this.setSize(500, 400);
		this.setVisible(true);
		
	}
	//현재 상태에서 단위테스트 가능한가요?
	//힌트  - actionPerformed는 콜백메소드야 - 내가 호출하지 못해
	//파라미터 자리에 클래스(참조형) 타입도 올 수 있다.
	//콜백메소드의 파라미터자리는 개발자가 아닌 JVM에서 주입받는다.
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("actionPerformed");
		Object obj = e.getSource();//절대로 NullPointerException이 발생하지 않음
		//너 조회버튼 누른거야? 네
		if(obj == jbtn_sel) {
			boardController = new BoardController();
			boardController.getBoardList();
		}

	}

	public static void main(String[] args) {
		BoardView bview = null;
		bview = new BoardView();

	}

}
