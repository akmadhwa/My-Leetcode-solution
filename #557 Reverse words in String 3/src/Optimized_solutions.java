
public class Optimized_solutions {

	public static String reverseWords(String s) {
		char[] s1 = s.toCharArray();
		int i = 0;
		for(int j = 0 ; j < s1.length ; j++) {
			if(s1[j] == ' ') {
				reverse(s1, i, j-1);
				i = j + 1;

			}
		}
		reverse(s1, i, s1.length - 1);
		return new String(s1);
	}

	public static void reverse(char[] s , int l , int r) {
		while(l < r) {
			char temp = s[l];
			s[l] = s[r];
			s[r] = temp;
			l++;
			r--;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String k = "hello world";
		System.out.println(reverseWords(k));
	}

}
