
public class Solution_B {

	public static boolean canConstruct(String ransomNote, String magazine) {
		int[] map = new int[26];
		for(char c : ransomNote.toCharArray()) {
			int index = magazine.indexOf(c, map[c - 'a']);
			System.out.println(c+", "+index);
			if(index == -1) {
				return false;

			}
			map[c - 'a'] = index + 1;

		}
		return true;
	}

	public static void main(String[] args) {
		boolean output = canConstruct("caa", "aabca");
		System.out.println(output);

	}

}
