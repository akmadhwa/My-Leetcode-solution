
public class Solution_b {

	public static boolean isPowerOfThree(int n) {
		return (Math.log10(n) / Math.log10(3)) % 1 == 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean a = isPowerOfThree(45);
		System.out.println(a);
	}
}
