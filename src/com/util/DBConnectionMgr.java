package com.util;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBConnectionMgr {
	//null로 초기화 하는 이유는 null체크를 해서 null일때만 새로 인스턴스화 하고 
	//null아니면 그냥 계속 사용하자
	static DBConnectionMgr dbMgr = null;//왜 static인가요? - 싱글톤 패턴으로 흉내내보기
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	public static final String _DRIVER 	= "oracle.jdbc.driver.OracleDriver";
	public static final String _URL 		= "jdbc:oracle:thin:@127.0.0.1:1521:orcl11";
	public static final String _USER 		= "scott";
	public static final String _PW 			= "tiger";
	//Calendar클래스 처럼  메소드를 통해서 객체 주입 받기
	public static DBConnectionMgr getInstance() {//공유 - 하나이다 - 복제본을 만들지 않겠습니다.
		if(dbMgr==null) dbMgr = new DBConnectionMgr();
		return dbMgr;
	}
	//리턴 타입으로 연결통로를 확보한 con을 얻는다. 
	//Connection(url, 계정 정보 일치 -  인증실패, 에러 코드) -> PrepareStatement(쿼리문 전달, 처리 요청함) -> ResultSet(커서를 조작하는 메소드를 제공받음) 생성하므로
	//앞에 객체가 주입되지 않으면 나머지 뒤에는 모두 null인 상태에 놓인다.
	public Connection getConnection()
	{
		//예외처리시 try..catch블록을 사용하는데 멀티 블록이 가능함 : 단 하위에서 상위클래스로 처리함
		try {
			//각 제조사의 드라이버 클래스를 로딩하기
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//물리적으로 떨어져 있는 오라클 서버와 연결통로 확보
			con = DriverManager.getConnection(_URL,_USER,_PW);
		} catch(ClassNotFoundException ce) {
			System.out.println("ojdbc6.jar를 설정하지 않았다. 그래서 클래스를 못찾는다.");
		} catch (Exception e) {//비번이 틀린경우,
			e.printStackTrace();
		}
		return con;
	}
	//위 코드에서 22번과 24번 호출시 에러가 없다면 catch블록은 경유하지 않는다.
	public static void freeConnection(ResultSet rs, PreparedStatement pstmt, Connection con){
		try {
			if(rs !=null) rs.close();
			if(pstmt !=null) pstmt.close();
			if(con !=null) con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void freeConnection(PreparedStatement pstmt, Connection con){
		try {
			if(pstmt !=null) pstmt.close();
			if(con !=null) con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void freeConnection(ResultSet rs, CallableStatement cstmt, Connection con){
		try {
			if(rs !=null) rs.close();
			if(cstmt !=null) cstmt.close();
			if(con !=null) con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void freeConnection(CallableStatement cstmt, Connection con){
		try {
			if(cstmt !=null) cstmt.close();
			if(con !=null) con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
