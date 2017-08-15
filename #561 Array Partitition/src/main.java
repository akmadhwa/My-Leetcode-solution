
import java.util.*;
public class main {

	public static void main(String[] args) {
		int [] arr = {1,2,3,4};
		System.out.println(arrayPairSum(arr));

	}

	public static int arrayPairSum(int[] nums){

		Arrays.sort(nums);

		int ArraysLength = nums.length, sum = 0;

		for(int i = ArraysLength-1 ;i > 0 ; i-=2 ){
			sum+= Math.min(nums[i], nums[i - 1]);
		}
	return sum;
	}

}
