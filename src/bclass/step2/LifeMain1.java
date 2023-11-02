package bclass.step2;

import java.util.StringTokenizer;

class Life1{
	String s = null;//������ �ν��Ͻ�ȭ�� �� ���� �ϴ� null�� ������ �д�.
	//�ʿ��� �� ����(������ �ΰ�? �ƴ� �������ΰ�- ��ü�� �ٲ��) ������ �ٲ�
	//�ʱ�ȭ
	public void init() {
		//Spring�� ������� ���� ����̴�. - �ֳĸ� ���� ���� new�����ϱ�
		s = new String("300|kiwi");//��ü�� ���� ������ ����Ŭ�� �����ڰ� �����ؾ� �Ѵ�.
	}
	//�ڿ�Ȱ��
	public void service() {
		StringTokenizer st = new StringTokenizer(s,"|");
		st.nextToken();//300
		String who = st.nextToken();//kiwi
		System.out.println(who);//kiwi
	}
	//�ڿ��ݳ� - �Ҹ�
	//����� �ڿ�(JDBC,  network)�� �ݳ����� ������ gc�� ������ �����쿡 ���� ���Ÿ� �Ѵ�. - ���������� ó���ȴ�.
	//��������� �϶� - �ڹ�Ʃ����
	public void destroy() {
		if(s!=null) {
			s = null;
			//��������� ȣ���� �� �ִ�. - �޸� ������ �������� - ������ ����ȭ ���� - static������ �ȵȴ�. - 2���� �����ڵ��� static �����Ѵ�.
			System.gc();//��� ������� �� �ƴϴ�. - gc�� �����尡 �����Ǿ� ���� - �����쿡 ���� ������(��ü �켱����)���� ó���Ѵ�.
		}
	}
}
//�޼ҵ��� ��û ������ ����  NullPointerException�߻��� ���� �ִ�. - 
//Ʈ���� ���� -  ������
public class LifeMain1 {
	public static void main(String[] args) {
		Life1 life = new Life1();
		
		life.init();
		life.destroy();//candidate���� - Gavage Collector - ��
		life.service();

	}

}
