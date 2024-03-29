

public class solution_a {
	private static final String[] THOUSANDS = {"", "Thousand", "Million", "Billion"};
	private static final String[] TENS	={"","Tens" ,"Twenty","Thirty","Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
	private static final String[] LESS_THAN_20 = {"", "One", "Two", "Three", "Four", "Five", "Six","Seven","Eight", "Nine", "Ten", "Eleven", "Twelve","Thirteen", "Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};


	public static String numberToWords(int n) {
		int index = 0;
		String words = "";

		if (n == 0) {
			return "Zero";
		}


		while(n > 0) {
			if(n % 1000 != 0) {
				words =  helper(n % 1000) + THOUSANDS[index] + " " + words;
			}
			n /= 1000;
			index++;
		}
		return words;
	}

	public static String helper(int num) {
		if(num == 0) {
			return "";
		}
		else if(num < 20) {
			return LESS_THAN_20[num] +" ";
		}
		else if(num < 100) {
			return TENS[num / 10] + " " + helper(num % 10);
		}else {
			return LESS_THAN_20[num / 100] + " Hundred " + helper(num % 100);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(numberToWords(1234));


}
}
