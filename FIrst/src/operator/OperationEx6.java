package operator;

public class OperationEx6 {

	public static void main(String[] args) {
	
		/*
		 * 복합 대입 연산자
		 * 
		 *	연산자	기능
		 * 	+=		두 항의 값을 더해서 왼쪽 항을 대입한다.
		 * 	-=		왼쪽 항에서 오른쪽 항을 빼서 그 값을 왼쪽 항에 대입한다.
		 * 	*=		두 항의 값을 곱해서 왼쪽 항에 대입한다.
		 * 	/=		왼쪽 항을 오른쪽 항으로 나누어 그 몫을 왼쪽 항에 대입한다.
		 * 	%=		왼쪽 항을 오른쪽 항으로 나누어 그 나머지를 왼쪽 항에 대입한다.
		 * 	<<=		비트를 왼쪽으로 이동하고 그 값을 왼쪽 항에 대입한다.
		 * 	>>=		비트를 오른쪽으로 이동하고 그 값을 왼쪽 항에 대입한다. (왼쪽에 채워지는 비트 값은 부호비트와 동일하다.)
		 *  >>>=	비트를 오른쪽으로 이동하고 그 값을 왼쪽 항에 대입한다. (왼쪽에 채워지는 비트 값은 0이다.)
		 *  &=		두 항의 & 비트 연산 후 그 값을 왼쪽 항에 대입한다.
		 *  |=		두 항의 | 비트 연산 후 그 값을 왼쪽 항에 대입한다.
		 *  ^=		두 항의 ^ 비트 연산 후 그 값을 왼쪽 항에 대입한다.
		 */
		
		/*
		 * 비트 논리 연산자
		 * 비트 단위로 &,|,^,~ 연산이 이루어진다.
		 */
		
		int num1 = 5;			//  5를 8비트의 2진수로 바꾸면 00000101
		int num2 = 10;			// 10을 8비트의 2진수로 바꾸면 00001010
		int result;
		// &(AND) 연산자는 두 개의 비트 값이 모두 1인 경우에만 연산의 결과 값이 1이 됩니다.
		result = num1 & num2;	// 00000000 = 00000101 & 00001010 계산 후 10진수로 변경
		System.out.println(result);
		
		// |(OR) 연산자는 비트 값이 하나라도 1이면 연산 결과 값이 1이 됩니다.
		result = num1 | num2;	// 00001111 = 00000101 | 00001010 계산 후 10진수로 변경
		System.out.println(result);

		// ^(XOR) 연산자는 같은 비트 값이면 0, 다른 값이면 1이 됩니다.
		result = num1 ^ num2;	// 00001111 = 00000101 ^ 00001010 계산 후 10진수로 변경
		System.out.println(result);

		// ~(반전) 연산자는 비트 값을 0은 1로, 1은 0으로 바꾸는 연산자입니다.
		result = ~num2;	// 11110101 = ~00001010 계산 후 10진수로 변경
		System.out.println(result);
		
		/*
		 *  비트 이동 연산자
		 *  비트 이동 연산자는 <<, >>, >>> 세가지가 있다. 시프트(shift) 연산자라고도 한다.
		 */
		
		// << 시프트 연산자는 왼쪽으로 비트를 이동하는 연산자입니다.
		result = num1 << 2;	// 00010100 = 00000101 << 2
		/*
		 * 00000101을 두 비트만큼 왼쪽으로 이동했습니다. 이때 앞의 두 자리 비트00은 없어지고 뒷부분은 0으로 채워집니다.
		 * 왼쪽으로 n비트 이동한다는 것은 기존 값에 2의n승만큼 곱한다는 뜻입니다. 따라서 왼쪽으로 2비트 이동한 00010100 5*2의2승, 즉, 20이 됩니다.
		 */
		
		// >> 시프트 연산자는 오른쪽으로 비트를 이동하는 연산자입니다.
		result = num2 >> 2;	// 00000010 = 00001010 >> 2
		/*
		 * 오른쪽으로 2비트 이동하면 기존 값에 2의n승만큼 나눕니다. 위 경우 10/2의2승이 되므로 결과 값은 2가 됩니다.
		 */
		
		/*
		 *  >>> 시프트 연산자는 >> 연산과 동일하게 비트를 오른쪽으로 이동합니다.
		 *  차이가 있다면 >>> 연산자는 왼쪽에 채워지는 비트 값이 부호 비트와 상관없이 무조건 0이 됩니다. 
		 */
		 
		/*
		 * 연산자 우선순위
		 * 
		 * 우선순위	형			연산자				연산방향
		 * 1		일차식		() [] .				--->
		 * 2		단항		! ++ -- + -			<---
		 * 3		산술		% /					--->
		 * 4		산술		+ -					--->
		 * 5		비트 이동	<< >>				--->
		 * 6		관계		< > <= >=			--->
		 * 7		관계		== !=				--->
		 * 8		비트 곱		&					--->
		 * 9		비트 차		^					--->
		 * 10		비트 합		|					--->
		 * 11		논리 곱		&&					--->
		 * 12		논리 합		||					--->
		 * 13		조건		? :					--->
		 * 14		대입		= += -= *= &= /=	<---
		 */
	}

}
