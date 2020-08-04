package chapter2;

public class TypeConversion {
	public static void main(String[] args) {
		
		/*
		 * 형 변환
		 * 1. 바이트 크기가 작은 자료형에서 큰 자료형으로 형 변환은 자동으로 이루어진다.
		 * 2. 덜 정밀한 자료형에서 더 정밀한 자료형으로 형 변환은 자동으로 이루어진다.
		 * 
		 * 묵시적 형 변환이 이루어지는 관계. 반대방향으로 형 변환하려면 강제로 변화해야 한다.
		 * 정수								실수
		 * byte -> short -> int -> long		-> float -> double
		 * (1byte) (2byte) (4byte) (8byte)	  (4byte)  (8byte)
		 * 		   char
		 * 		   (2byte)
		 */
		
		int n = 10;			//int형 변수 n에 정수 값 10을 대입
		double dnum = n;	//int형 변수 n의 값을 double형 변수 dnum에 대입
	}
}
