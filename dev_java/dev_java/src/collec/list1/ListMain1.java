package collec.list1;

import java.util.ArrayList;
import java.util.List;

import javax.swing.plaf.basic.BasicListUI;

class List1{
	int i = 1;
	List<Integer> list = new ArrayList<>(); 
	List<CustomerVO> clist = new ArrayList<>(); 
	void init() {
		CustomerVO cvo = new CustomerVO();
		cvo.setC_id(1);
		cvo.setC_name("키위");
		//cvo.setC_birthday("2006-10-22");
		clist.add(cvo);
	}
}
public class ListMain1 {

	public static void main(String[] args) {
		List1 l1 = new List1();
		//
		l1.init();
		System.out.println(l1.clist.size());//1
		System.out.println(l1.clist);//[]
		CustomerVO rcVO = null;
		if(l1.clist.size()>0) {
			rcVO = l1.clist.get(0);
			System.out.println(rcVO.getC_name());
			System.out.println(rcVO.getC_id());
			System.out.println(rcVO.getC_birthday());
		}
		else {
			//rcVO = new CustomerVO();
			//rcVO.setC_name("토마토");
			//
			System.out.println(rcVO);//null
			//System.out.println(l1.clist.get(0).getC_name());
		}
	}

}
