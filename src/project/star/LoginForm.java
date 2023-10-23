package project.star;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class LoginForm extends JFrame {
	//선언부
	private UserInfo userInfo;
	private ArrayList<UserInfo> users;
	JLabel idLabel=new JLabel("ID");				//id라벨
	JLabel pwLabel=new JLabel("PW");				//비번라벨
	JTextField idField=new JTextField(10);			//아이디칸 
	JTextField pwField=new JTextField(10);			//비밀번호
	JButton loginBtn= new JButton("로그인");			//로그인버튼
	JButton joinBtn= new JButton("회원가입");			//회원가입버튼
	Dimension labelSize=new Dimension(80,30);
	Dimension btnSize=new Dimension(100,25);
	int tfsize=10;
	//생성자
	public LoginForm() {
		initDisplay();
		addListener();
	}
	
	public	UserInfo getUsers() {
		return userInfo;
	}
	//화면처리부
	public void initDisplay() {
		idLabel.setPreferredSize(labelSize);
		pwLabel.setPreferredSize(labelSize);	
		  // FlowLayout 왼쪽 정렬
        FlowLayout flowLeft = new FlowLayout(FlowLayout.LEFT);
        // pnlNorth(pnlId, pnlPw)
        JPanel pnlNorth = new JPanel(new GridLayout(0, 1));
        JPanel pnlId = new JPanel(flowLeft);
        pnlId.add(idLabel);
        pnlId.add(idField);
        JPanel pnlPw = new JPanel(flowLeft);
        pnlPw.add(pwLabel);
        pnlPw.add(pwField);
        pnlNorth.add(pnlId);
        pnlNorth.add(pnlPw);
        JPanel pnlSouth = new JPanel();
        pnlSouth.add(loginBtn);
        pnlSouth.add(joinBtn);
        pnlNorth.setBorder(new EmptyBorder(0, 20, 0, 20));
        pnlSouth.setBorder(new EmptyBorder(0, 0, 10, 0));
        add(pnlNorth, BorderLayout.NORTH);
        add(pnlSouth, BorderLayout.SOUTH); 
        setTitle("Login");
        pack();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        setResizable(false);
        setVisible(true);
}
	//동작부
	public void addListener() {
		joinBtn.addActionListener(new ActionListener() {
			//회원가입버튼을 눌렀을 때.
			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new RegisterMember(LoginForm.this);
				idField.setText("");
				pwField.setText("");
				
			}
		});
		loginBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 아이디칸이 비었을 경우
				if (idField.getText().isEmpty()) {
					JOptionPane.showMessageDialog(LoginForm.this
							,"아이디를 입력해주세요."
							,"로그인폼"
							,JOptionPane.WARNING_MESSAGE);
				}
				// 아이디가 존재하는 경우
				else if (users.contains(new UserInfo(idField.getText()))) {
					
				// 비밀번호칸이 비었을 경우
					if(pwField.getText().isEmpty()) {
						JOptionPane.showMessageDialog(LoginForm.this
								, "패스워드를 입력해주세요."
								,"패스워드폼"
								,JOptionPane.WARNING_MESSAGE);
					}
				// 비밀번호가 일치하지 않는 경우
					else if (!users.contains(new UserInfo(pwField.getText()))) {
						JOptionPane.showMessageDialog(LoginForm.this
								, "패스워드가 틀렸습니다.\n 다시 입력해주세요."
								,"패스워드폼"
								,JOptionPane.WARNING_MESSAGE);
					}
				// 다 완료되었을경우
					else {
						
						//화면 닫기
						setVisible(false);
						//게시판 접속
						//아이디 비번 창 빈칸
						idField.setText("");
						pwField.setText("");
					}
				}
				// 아이디가 존재하지 않는 경우
				else {
					JOptionPane.showMessageDialog(
							LoginForm.this,
							"존재하지 않는 아이디입니다." );
				}
			}///////////////////////////////////////////end of actionPerformed()
		});////////////////end of new ActionListener()
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent we) {
				int close=JOptionPane.showConfirmDialog(
						LoginForm.this					//parent component
						,"로그인 프로그램을 종료합니다."		//object message
						,"종료" 							//String title
						,JOptionPane.OK_CANCEL_OPTION	//int option type
						,JOptionPane.WARNING_MESSAGE	//int message type
						);
				if (close==JOptionPane.YES_OPTION) {
					System.exit(0);
				}
			}
		});
	}//end of addListener()
	//메인메소드
	public static void main(String[] args) {
		new LoginForm();

	}

}
