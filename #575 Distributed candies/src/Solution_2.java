import java.util.HashSet;

public class Solution_2 {
	
	public static int distributedCandie(int[] candies) {
		HashSet<Integer> set = new HashSet<Integer>();
		for(int candy : candies) {
			set.add(candy);
			
		}
		return Math.min(set.size(), candies.length / 2);
	}
	
	public static void main(String[] args) {
		int[] arr = {1,1,2,3,2,2,2,6};
		System.out.println(distributedCandie(arr));
	}
}
