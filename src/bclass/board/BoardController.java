package bclass.board;

import java.util.List;
import java.util.Map;

//화면과 로직(모델계층-데이터계층과 업무 프로세스 처리)을 분리하자
//화면과 로직을 연결해주는 클래스 설계함
//로직(입력, 수정, 삭제, 전체조회 상세조회 업무내용 - 메소드 5개 설계함)
//입력인 경우 - 성공이면 1을 반환하고 실패이면 0을 반환 - 누가반환하지 - 오라클 서버
//5가지의 메소드의 리턴타입과 파라미터 타입을 결정해야 함
//공통점 찾아내서 하나의 메소드로 합칠 수 있는 것인지 아니면 메소드를 모두 다 분리해야 하는지 결정
public class BoardController {
	BoardDao bDao = new BoardDao(this);//전역변수
	public List<Map<String,Object>> getBoardList(){
		System.out.println("getBoardList호출 성공");
		return null;
	}
}
