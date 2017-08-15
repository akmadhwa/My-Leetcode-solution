
public class Solution_1 {
	
	 public static String reverseString(String s) {
	        char[] arr = s.toCharArray();
	        int l = 0;
	        int r = arr.length-1;
	        
	        while(l < r) {
	        	char temp  = arr[l];
	        	arr[l] = arr[r];
	        	arr[r] = temp;
	        	l++;
	        	r--;
	        }
	        return new String(arr);
	    }
	 
	public static void main(String[] args) {
		String s = "akma";
		System.out.println(reverseString(s));

	}

}
