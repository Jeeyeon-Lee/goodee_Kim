package bclass.step2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
//�ν��Ͻ�ȭ  -> �ʿ��� ��ü�� ����(��ü����-����- ������)�޴� ���̴�.
//������ �ν��Ͻ�ȭ, �̸� �ν��Ͻ�ȭ
//Spring������ ���� �����ڰ� �����(�������� ���ϴϱ�-��ü ������ ����Ŭ) �ν��Ͻ�ȭ�� ���� �ʴ´�
public class HMain extends JFrame implements ActionListener {
	JButton jbtn = null;
	String title = null;
	public HMain() {//�ν��Ͻ�ȭ�� �� ������ �ݺ��ؼ� ȣ���� �ȴ�.
		//�����ڿ��� ȭ���� ȣ���ϴ� �� �ν��Ͻ�ȭ �߻��� �� ���� ȭ���� ���� �� �ִ� ���̴�.
		jbtn = new JButton("��ȸ");
	}
	public HMain(String title) {//�ν��Ͻ�ȭ�� �� ������ �ݺ��ؼ� ȣ���� �ȴ�.
		this.title = title;//���� �ʱ�ȭ�� �Ͽ���
	}	
	public void initDisplay() {
		new JButton("�Է�").addActionListener(this);//�̺�Ʈ�� �ߵ��� ������ ���ο� ��ư�� �� �����.
		this.add("North",new JButton("�Է�"));
		this.setTitle(title);//null
		this.setSize(500, 400);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		HMain hm = new HMain("Ÿ��Ʋ");
		hm.initDisplay();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
/*
�ν��Ͻ�ȭ�� �ϴ� ���
1. A a = new A(); �⺻
2. A a = null;
    a = new A();
3. A a = B.getInstance();  �̱������� - �ϳ��� - static��ſ� ���
4. Super s = new Sub(); - ������
�������̽� s  = new ����ü Ŭ����()
 �߻�Ŭ���� s = new ����ü Ŭ����()    
 
 �������̽��� ������� �������� ���յ� ���߸鼭 �����Ǹ� �Ͽ� ����ϴ� ������
 
 �߻�Ŭ����(�����ڵ� ����, �Ϲݸ޼ҵ嵵 �����ϴ�)
 :������ Ȯ��� ���õ� ����
 :�߻�Ŭ������  extends����ϹǷ� �������̽� ó�� ���յ��� ���� �ʰ� ������ ���� - ���뼺 ������(Ʈ����)
 
 īī�� -> īī�� �� -> īī�� ���� -> īī�� ���� -> īī�� ��ũ
 ���� �ٸ� ����
 
 �м� - ���� - ���� - �׽�Ʈ - ���� : ������ ��
 
 ������ ����� - ����, ���μ��� ���õǰ� ������� �䱸���� . ��� �ݿ��� �� �ִ� �����
 
 

*/