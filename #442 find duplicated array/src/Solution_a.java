import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution_a {
	public static List<Integer> finDuplicates(int[] nums) {
		List<Integer> res = new ArrayList<>();
		for(int i = 0 ; i < nums.length ; i++) {
			int index = Math.abs(nums[i]) - 1;
			System.out.println("value : "+i+" value2 = "+index);
			if(nums[index] < 0) {
				res.add(Math.abs(index+1));
				System.out.println("push "+Math.abs(index+1));
				
			}
			nums[index] = -nums[index];
			System.out.println(Arrays.toString(nums));
			System.out.println();
		}
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []	input = {4,3,2,7,8,2,4,1};
		List<Integer> huhu = finDuplicates(input);
		System.out.println(huhu.toString());
//		System.out.println(Math.abs(4) - 1);
//		

	}

}
