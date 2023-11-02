package project.star;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class RegisterMember extends JFrame implements ActionListener {
//선언부
	public UserInfo userInfo;
	LoginForm lf = new LoginForm();
	int tfSize = 10;
	Dimension lblSize = new Dimension(80, 35);
	Dimension btnSize = new Dimension(100, 25);

	JPanel jp_center = new JPanel();
	JLabel jlb_id = new JLabel("아이디");
	JLabel jlb_pw = new JLabel("비밀번호");
	JLabel jlb_pwc = new JLabel("비밀번호 확인");
	JLabel jlb_name = new JLabel("이름");
	JLabel jlb_gender = new JLabel("성별");
	JTextField jtf_id = new JTextField(tfSize); // id칸
	JTextField jtf_pw = new JTextField(tfSize); // pw칸
	JTextField jtf_pwc = new JTextField(tfSize); // pw확인
	JTextField jtf_name = new JTextField(tfSize);// 이름칸
	// String[] genderList = {"남자","여자"}; //성별칸
	// JRadioButton rbtnMale = new JRadioButton("Male", true);
	// JRadioButton rbtnFemale= new JRadioButton("Female");
	JScrollPane jsp = null;
	JPanel jp_south = new JPanel();
	JButton jbtn_ins = new JButton("등록");
	JButton jbtn_close = new JButton("닫기");

//생성자
	public RegisterMember(LoginForm lf) {
		this.lf = lf;
		userInfo = lf.getUsers();// 아이디 정보로 사용자를 가져온다 = 유저데이터셋

		initDisplay();
	}

	public RegisterMember() {
		initDisplay();
	}

//회원 추가

//화면생성부
	public void initDisplay() {
		jbtn_close.addActionListener(this);
		jbtn_ins.addActionListener(this);
		jp_center.setLayout(null);
		jlb_id.setBounds(20, 20, 100, 20);
		jtf_id.setBounds(120, 20, 120, 20);
		jlb_pw.setBounds(20, 45, 100, 20);
		jtf_pw.setBounds(120, 45, 120, 20);
		jlb_pwc.setBounds(20, 70, 100, 20);
		jtf_pwc.setBounds(120, 70, 150, 20);
		jlb_name.setBounds(20, 95, 100, 20);
		jtf_name.setBounds(120, 95, 150, 20);
		jp_center.add(jlb_id);
		jp_center.add(jtf_id);
		jp_center.add(jlb_pw);
		jp_center.add(jtf_pw);
		jp_center.add(jlb_pwc);
		jp_center.add(jtf_pwc);
		jp_center.add(jlb_name);
		jp_center.add(jtf_name);
		jp_center.add(jlb_gender);
		// ButtonGroup group = new ButtonGroup();
		// group.add(rbtnMale);
		// group.add(rbtnFemale);
		jp_south.setLayout(new FlowLayout(FlowLayout.RIGHT));
		jp_south.add(jbtn_ins);
		jp_south.add(jbtn_close);
		this.add("South", jp_south);
		jsp = new JScrollPane(jp_center);
		this.add("Center", jsp);
		this.setTitle("회원가입");
		this.setSize(400, 500);
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		// 회원가입시 아이디 중복? 비번 중복? 아이디 비번 이름 등 정보 미기입에 따른 경고 안내
		if (obj == jbtn_ins) {
			// 정보 하나라도 비어있으면
			if (isBlank()) {
				JOptionPane.showMessageDialog(RegisterMember.this, "모든 정보를 입력해주세요.");

				// 모두 입력했을 때
			} else {
				// Id 중복일 때
				if (userInfo.members.containsValue(new UserInfo(jtf_id.getText()))) {
					JOptionPane.showMessageDialog(RegisterMember.this, "이미 존재하는 Id입니다.");
					jtf_id.requestFocus();
				}
				/*
				 * //비밀번호와 비밀번호 확인이 서로 다르면 else if (!jtf_pw.equals(jtf_pwc)) {
				 * JOptionPane.showMessageDialog( RegisterMember.this ,"패스워드가 서로 일치하지 않습니다." );
				 */
				jtf_pw.requestFocus();
			}
		} else {
			userInfo.members.get(jtf_id);
			userInfo.members.get(jtf_pw);
			userInfo.members.get(jtf_name);
			JOptionPane.showMessageDialog(RegisterMember.this, "회원가입을 완료했습니다. \n 다시 로그인해주세요.");
			dispose();
			lf.setVisible(true);
		}

		if (obj == jbtn_close) {
			System.exit(0);
		}
	}

	public boolean isBlank() {
		boolean result = false;
		if (jtf_id.getText().isEmpty()) {
			jtf_id.requestFocus();
			System.out.println("id비었다.");
			return true;
		}
		if (jtf_pw.getText().isEmpty()) {
			jtf_pw.requestFocus();
			System.out.println("pw비었다.");
			return true;
		}
		/*
		 * if(jtf_pwc.getText().isEmpty()) { jtf_pwc.requestFocus();
		 * System.out.println("pw확인비었다."); return true; }
		 */
		if (jtf_name.getText().isEmpty()) {
			jtf_name.requestFocus();
			System.out.println("이름비었다.");
			return true;
		}

		return result;
	}

	/*
	 * public String getGender() { if(rbtnMale.isSelected()) { return
	 * rbtnMale.getText(); } return rbtnFemale.getText(); }
	 */
	public static void main(String[] args) {
		new RegisterMember();
	}
}
