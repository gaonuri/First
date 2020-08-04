package ifexample;

public class SwitchCase {

	public static void main(String[] args) {
	
		int month = 1;
		int day;
		
		switch (month) {
			case 1 : day = 31;
					 break;
			case 2 : day = 28;
					 break;
			case 3 : day = 31;
					 break;
			case 4 : day = 30;
					 break;
			case 5 : day = 31;
					 break;
			case 6 : day = 30;
					 break;
			case 7 : day = 31;
					 break;
			case 8 : day = 31;
					 break;
			case 9 : day = 30;
					 break;
			case 10: day = 31;
					 break;
			case 11: day = 30;
					 break;
			case 12: day = 31;
					 break;
		}
		
		switch (month) {
		case 1 : case 3 : case 5 : case 7 : case 8 : case 10: case 12: day = 31;
				 break;
		case 4 : case 6 : case 9 : case 11: day = 30;
				 break;
		case 2 : day = 28;
				 break;
		}
		
	}

}
