package classpart;

public class/*클래스를 만드는 예약어*/ Student/*클래스 이름*/ {

	// 멤버 변수
	int studentID;			// 학번
	String studentName;		// 학생 이름
	int grade;				// 학년
	String address;			// 주소
	
	// 메소드
	public void showStudentInfo() {
		System.out.println(studentName + " , " + address);	// 이름, 주소 출력
	}
	
	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	
	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public static void main(String[] args) {
		Student studentAhn = new Student();	// 클래스 생성
		studentAhn.studentName = "안연수";
		
		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getStudentName());
	}
}
