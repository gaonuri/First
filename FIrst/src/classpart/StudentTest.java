package classpart;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentAhn = new Student();	// Student 클래스 생성
		studentAhn.studentName = "안연수";	// 멤버 변수 사용
		
		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getStudentName());	// 멤버 메소드 사용
	}

}
