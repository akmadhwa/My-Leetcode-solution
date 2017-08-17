
public class Solution_A {

	public static int addDigits(int num) {
		if(num == 0) {
			return 0;
		}
		if(num % 9 == 0) {
			return 0;
		}
		else {
			return num % 9;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int test = 1234;
		System.out.println(addDigits(test));
	}

}
