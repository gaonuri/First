package exercise;

public class Exercise1 {
	
	public static void main(String[] args) {
		
		// 문제1 operator 값이 +,-,*,/인 경우에 사칙 연산을 수행하는 프로그램을 if-else if문과 switch-case문을 사용해 작성해 보세요.
		int num1 = 10;
		int num2 = 2;
		char operator = '+';
		int i = 0;
		int j = 0;
		int count = 8;
		
		if(operator == '+') {
			System.out.println("num1 + num2 = " + (num1 + num2));
		} else if (operator == '-') {
			System.out.println("num1 - num2 = " + (num1 - num2));
		} else if (operator == '*') {
			System.out.println("num1 * num2 = " + (num1 * num2));
		} else if (operator == '/') {
			System.out.println("num1 / num2 = " + (num1 / num2));
		}
		
		operator = '*';
		
		switch(operator) {
			case '+' : 	System.out.println("num1 + num2 = " + (num1 + num2));
						break;
			case '-' : 	System.out.println("num1 - num2 = " + (num1 - num2));
						break;
			case '*' : 	System.out.println("num1 * num2 = " + (num1 * num2));
						break;
			case '/' : 	System.out.println("num1 / num2 = " + (num1 / num2));
						break;
		}
		System.out.println();
		
		// 문제2 구구단을 짝수 단만 출력하도록 프로그램을 만들어 보세요.
		for(i = 2; i < 10; i++) {
			if(i % 2 == 1) {
				continue;
			}
			for(j = 1; j < 10; j++) {
				System.out.println(i + " * " + j + " = " + i * j);
			}
			System.out.println();
		}
		
		// 문제3 구구단을 단보다 곱하는 수가 작거나 같은 경우까지만 출력하는 프로그램을 만들어 보세요.
		for(i = 2; i < 10; i++) {
			for(j = 1; j < 10; j++) {
				if(i < j) {
					break;
				}
				System.out.println(i + " * " + j + " = " + i * j);
			}
			System.out.println();
		}
		
		// 문제 4 반복문을 사용하여 다음 모양을 출력하는 프로그램을 만들어 보세요.
		for(i = 0; i < count; i++) {
			if(i % 2 == 0) {
				continue;
			}
			for(j = count; j > i; j--) {
				System.out.print(" ");
			}
			for(j = 0; j < i; j++) {
				System.out.print(" *");
			}
			System.out.println();
			System.out.println();
		}
		
		// 문제 5 반복문과 조건문을 사용하여 다음 모양을 출력하는 프로그램을 만들어 보세요.
		for(i = 0; i < count; i++) {
			if(i % 2 == 0) {
				continue;
			}
			for(j = count; j > i; j--) {
				System.out.print(" ");
			}
			for(j = 0; j < i; j++) {
				System.out.print(" *");
			}
			System.out.println();
			System.out.println();
		}
		
		for(i = 2; i < count; i++) {
			if(i % 2 == 0)  {
				continue;
			}
			for(j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for(j = count; j > i; j--) {
				System.out.print(" *");
			}
			System.out.println();
			System.out.println();
		}
	}
}
