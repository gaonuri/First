package ifexample;

public class IfExample {

	public static void main(String[] args) {
		
		int score = 101;
		char grade;
		
		if(score > 100) {
			System.out.println("전산오류입니다.");
			return;
		}
		else if(score >= 90) {
			grade = 'A';
		} 
		else if(score > 80){
			grade = 'B';
		}
		else if(score > 70){
			grade = 'C';
		}
		else if(score > 60) {
			grade = 'D';
		}
		else {
			grade = 'F';
		}
		System.out.println("성적은 " + grade + " 입니다.");
	}

}
