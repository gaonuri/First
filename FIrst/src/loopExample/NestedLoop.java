package loopExample;

public class NestedLoop {

	public static void main(String[] args) {
		
		int dan;
		int times;
		
//		for(dan = 2; dan < 10; dan++) {
//			for(times = 1; times < 10; times++) {
//				System.out.println(dan + " * " + times + " = " + dan * times);
//			}
//			System.out.println(); // 한 줄 띄워서 출력
//		}
		
		for(dan = 3; dan < 8; dan++) {
			for(times = 1; times < 10; times++) {
				System.out.println(dan + " * " + times + " = " + dan * times);
			}
			System.out.println(); // 한 줄 띄워서 출력
		}
	}

}
