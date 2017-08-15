import java.util.Arrays;

public class Solution_1 {

	public static int maxCandies(int[] s) {
		Arrays.sort(s);
		int count = 1;
		for(int i = 1 ; i < s.length && count < s.length/2 ; i++) {
			if(s[i] > s[i-1]) {
				count++;

			}
		}
		return count;

	}

	public static void main(String[] args) {
		// Start time
		long startTime = System.currentTimeMillis();

		// Testcase
		int[] testcase = {1,2,3,4,5,6,7,8,9};
		int s = maxCandies(testcase);
		System.out.println(s);

		// EndTime
		long endTime = System.currentTimeMillis();
		System.out.println("It takes "+ (endTime-startTime));

	}

}
