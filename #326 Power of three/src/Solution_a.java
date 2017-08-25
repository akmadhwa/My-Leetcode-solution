
public class Solution_a {
	public static boolean isPowerOfThree(int n) {
		while(n > 1) {
			if(n % 3 != 0) {
				return false;
			}
			n /= 3;
		}
		return n<= 0 ? false : true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean a = isPowerOfThree(45);
		System.out.println(a);
	}

}
