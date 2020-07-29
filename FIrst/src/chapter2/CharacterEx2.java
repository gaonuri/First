package chapter2;

public class CharacterEx2 {

	public static void main(String[] args) {
		char ch1 = '한';
		char ch2 = '\uD55C';	// '한'의 유니코드 한글 유니코드는 www.unicode.org/chart/PDF/UAC00.pdf에서 확인할 수 있다.
		
		System.out.println(ch1);
		System.out.println(ch2);
	}

}
