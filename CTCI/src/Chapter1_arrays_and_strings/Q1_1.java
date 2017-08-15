package Chapter1_arrays_and_strings;

public class Q1_1 {

//	Using Hash Table
	public static boolean isUniqueChars(String str){
		if (str.length() > 128) {
			return false;
		}

		boolean [] char_set = new boolean[128];
		for (int i = 0; i < str.length(); i++) {
			//This operation will change CHAR to utf-16
			int val = str.charAt(i);
			if(char_set[val]) return false;
			char_set[val]  = true;
		}
		return true;
	}


	public static void main(String[] args) {

		String[] words = {"abcde", "hello" , "apple", "kite", "paddle"};

		for(String word : words)
			System.out.println(word + " : "+isUniqueChars(word));

	}
}
