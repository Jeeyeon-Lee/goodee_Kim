package collec.list;

import java.util.ArrayList;
import java.util.List;

import collec.list1.CustomerVO;

public class CustomerManager {
	List<CustomerVO> cList = null;//전변은 언제 스캔이 되나요?
	CustomerManager(){
		cList = new ArrayList<>();
	}
	CustomerManager(int i){
	}
	/***********************************************************
	 * 고객정보 등록하기 구현 - 없는 걸 새로 등록하기
	 * INSERT INTO customer(c_id, c_name, c_birthday) VALUES(1,'키위','2000-10-21')
	 * @param cVO - 한 번에 여러가지의 값을 넘겨 받을 수 있는 VO를 사용한다.
	 * @return
	 ***********************************************************/
	public boolean customerInsert(CustomerVO cVO) {
		boolean isOk = false;
		return isOk;
	}
	/************************************************************
	 * 고객정보 수정하기 구현 - 기존에 있는 정보를 변경하기
	 * select(1건) - rcVO or Map(1건) - pcVO - 1이면 성공, 0이면 수정실패 판정
	 * UPDATE customer SET c_name = ?, c_birthday = ? WHERE c_id =?
	 * @param cVO
	 * @return
	 *************************************************************/
	public boolean customerUpdate(CustomerVO cVO) {
		boolean isOk = false;
		return isOk;
	}
	/**************************************************************
	 * 고객정보 삭제하기 구현
	 * DELETE FROM customer WHERE c_id =?(primary key)
	 * @param int
	 * @return true이면 성공, false이면 실패 - 메소드 선언시에 파라미터타입에 대한 선택과 리턴타입에 대한 선택 기준
	 ***************************************************************/
	public boolean customerDelete(int c_id) {
		boolean isOk = false;
		return isOk;
	}
	/****************************************************************
	 * 고객정보 상세보기 구현
	 * SELECT c_id, c_name, c_birthday FROM customer WHERE c_id = ?
	 * @param c_id
	 * @return CustomerVO(한테이블일때) or Map(두테이블 이상이어서 조인이 불가피 할때)
	 ****************************************************************/
	public CustomerVO customerSelect(int c_id) {
		CustomerVO rcVO = null;
		return rcVO;
	}
	/*****************************************************************
	 * 고객정보 전체보기 구현 - 파라미터가 필요없다.- 왜냐면 조건절이 필요없으니까요.
	 * SELECT c_id, c_name, c_birthday FROM customer
	 * @return List<VO> or List<Map>
	 ******************************************************************/
	public List<CustomerVO> customerSelectAll() {
		List<CustomerVO> cList = null;
		return cList;
	}
	public static void main(String[] args) {
		CustomerManager cm = null;
		cm = new CustomerManager(0);
	}

}
