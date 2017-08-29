
public class solution_a {
	public static int singleNonDuplicate(int [] nums) {
		int start = 0;
		int end = nums.length - 1;
		
		while(start < end) {

			int mid = (start + end) / 2;
			System.out.println("mid = "+mid);
			System.out.println("array = "+nums[mid]);
			
			if(mid % 2 == 1) {
				mid--;
			}
			if(nums[mid] != nums[mid + 1]) {
				end = mid;
				System.out.println("mid2 ="+mid);
			}else {
				start = mid + 2;
			}
		}
		return nums[start];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2,2,3,3,4,4,8};
		System.out.println(singleNonDuplicate(nums));
	}

}
