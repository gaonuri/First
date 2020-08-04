package classpart;

public class FunctionTest {

	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 20;
		
		int result = 0;
		double dResult = 0.0;
		
		result = add(num1, num2);	/* 함수 호출 */
		System.out.println(num1 + " + " + num2 + " = " + result + "입니다.");
		
		result = subtract(num1, num2);
		System.out.println(num1 + " - " + num2 + " = " + result + "입니다.");
		
		result = multiply(num1, num2);
		System.out.println(num1 + " * " + num2 + " = " + result + "입니다.");

		dResult = division(num1, num2);
		System.out.println(num1 + " / " + num2 + " = " + dResult + "입니다.");
	}
	
	public static int add(int n1, int n2) {
		int result = n1 + n2;
		
		return result;	// 결과 값 반환
	}

	public static int subtract(int n1, int n2) {
		int result = n1 - n2;
		
		return result;
	}
	
	public static int multiply(int n1, int n2) {
		int result = n1 * n2;
		
		return result;
	}
	
	public static double division(double n1, double n2) {
		double result = n1 / n2;
		
		return result;
	}
}
