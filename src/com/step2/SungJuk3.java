package com.step2;

public class SungJuk3 {
	public int total(int no1, int no2, int no3) {
		int tot = no1 +no2+no3;
		System.out.println(tot);
		return tot;
	}
	//평균을 구할 때 분모에 들어갈 변수를 파라미터로 받아볼까?
	/*****************************************************************
	 * 평균을 구하는 메소드 구현
	 * @param tot - 총점을 받아서 사용함
	 * @param d - 학생들의 평균을 구할때 학생수를 분모로 받습니다. -단 평균을 실수가 나올 수 있으므로 double로 함
	 * @return - 구한 평균값을 반환하기
	 *****************************************************************/
	public double avg(int tot, double d) {
		return tot/d;
	}
	public static void main(String[] args) {
		SungJuk3 sj = new SungJuk3();
		int tot = sj.total(75, 85, 95);
		double account = sj.avg(tot,3.0);
		System.out.println(account);
	}
}
