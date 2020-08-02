package operator;

public class OperationEx6 {

	public static void main(String[] args) {
	
		int num = 10;
		int num1 = 5;			//  5를 8비트의 2진수로 바꾸면 00000101
		int num2 = 10;			// 10을 8비트의 2진수로 바꾸면 00001010
		int result;
		// &(AND) 연산자는 두 개의 비트 값이 모두 1인 경우메나 연산의 결과 값이 1이 됩니다.
		result = num1 & num2;	// 00000000 = 00000101 & 00001010 계산 후 10진수로 변경
		System.out.println(result);
		
		// |(OR) 연산자는 비트 값이 하나라도 1이면 연산 결과 값이 1이 됩니다.
		result = num1 | num2;	// 00001111 = 00000101 | 00001010 계산 후 10진수로 변경
		System.out.println(result);

		// ^(XOR) 연산자는 같은 비트 값이면 0, 다른 값이면 1이 됩니다.
		result = num1 | num2;	// 00001111 = 00000101 | 00001010 계산 후 10진수로 변경
		System.out.println(result);

		// ~(NOR) 연산자는 비트 값을 0은 1로, 1은 0으로 바꾸는 연산자입니다.
		result = ~num;	// 11110101 = ~00001010 계산 후 10진수로 변경
		System.out.println(result);
		
		// 
	}

}
