package bclass.step1;

public class StudentTest {

	public static void main(String[] args) {
		Student me = new Student();
		System.out.println("학번 : "+me.getS_no());
		System.out.println("학생이름 : "+me.getS_name());
		System.out.println("학년 : "+me.getGrade());		
		me = new Student(9563409, "나신입", 3);
		System.out.println("학번 : "+me.getS_no());
		System.out.println("학생이름 : "+me.getS_name());
		System.out.println("학년 : "+me.getGrade());				
	}

}
