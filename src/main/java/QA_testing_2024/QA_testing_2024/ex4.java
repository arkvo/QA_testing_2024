package QA_testing_2024.QA_testing_2024;

public class ex4 {
	public static String Calculate (double a, double b, String mode) {
		switch (mode) {
			case "regular": {
			
				if (a > b) {
					return "A";
				}
				else {
					return "B";
				}
			}
		case "negatives":{
			if(-a < -b) {
				return"B";
			}
			else {
				return "A";
			}
		}
		case  "reciprocals" :{
			if (1/a < 1/b) {
				return "B";
						
			}
			else {
				return "A";
			}
		}
	
		default:
			
			throw new IllegalArgumentException("Unexpected value: " + mode);
		}
	}
	

}
