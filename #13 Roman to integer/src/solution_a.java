import java.util.Arrays;

public class solution_a {

	public static int romanToString(String s) {
		int [] romanToChar = new int[s.length()];
		for(int i = 0 ; i < s.length() ; i++) {
			switch(s.charAt(i)) {
			case 'I':
				romanToChar[i] = 1;
				break;
			case 'V' :
				romanToChar[i] = 5;
				break;
			case 'X' :
				romanToChar[i] = 10;
				break;
			case 'L' :
				romanToChar[i] = 50;
				break;
			case 'C' :
				romanToChar[i] = 100;
				break;
			case 'D' :
				romanToChar[i] = 500;
				break;
			case 'M' :
				romanToChar[i] = 1000;
				break;

			}
		}
		int sum = 0;
		for(int j = 0 ; j <  s.length() - 1 ; j++) {
			if(romanToChar[j] < romanToChar[j+1]) {
				sum-=romanToChar[j];
			}else {
				sum+=romanToChar[j];
			}
		}
		return sum+romanToChar[s.length()-1];

	}

	public static void main(String[] args) {
		String s = "XXVIII";
//		System.out.println(Arrays.toString(romanToString(s)));
		System.out.println(romanToString(s));
		System.out.println(4500%10);

	}
}
