package chapter2;

public class IntegerVariable {
	
	public static void main(String[] args) {
		
		short sVal = 10;
		byte bVal = 20;
		System.out.println(sVal + bVal);	
		/*
		 * 프로그램이 실행되어 정수 값을 연산할 때 4바이트를 기본 단위로 사용하기 때문에, 두 정수를 더하기 전에 두 정수는 모두, int형으로
		 * 변환됩니다. 또한 더한 결과 값도 int형으로 저장됩니다.
		 */
	}
	
}
