
public class Solution_1 {
	
	 public static int singleNumber (int A[]) {
		int result = 0;
		for( int i = 0 ; i < A.length ; i++) {
			result ^= A[i];
		}
		return result;
	}	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1, 2, 3, 2, 3};
		System.out.println(singleNumber(arr));
		
	}		
}
