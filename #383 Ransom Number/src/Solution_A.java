
public class Solution_A {

	public static boolean ransomNumber(String ransomNote, String magazine) {
		int[] charCounter = new int[26];
		for(int i = 0 ; i < magazine.length() ; i++) {
			charCounter[magazine.charAt(i) - 'a']++;

		}
		for(int j = 0 ; j < ransomNote.length() ; j++) {
			if(--charCounter[ransomNote.charAt(j) - 'a'] < 0) {
				return false;

			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean result = ransomNumber("abc", "aab");
		System.out.println(result);
	}

}
