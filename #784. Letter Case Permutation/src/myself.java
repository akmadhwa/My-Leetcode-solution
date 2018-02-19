import java.util.*;

public class myself {
	public static List<String> letterPermutation (String s) {
		List<StringBuilder> ans = new ArrayList();
		ans.add(new StringBuilder());
		
		for(char c : s.toCharArray()) {
			int n = ans.size();
				if(Character.isLetter(c)) {
					for(int i = 0 ; i < n ; ++i) {
						ans.add(new StringBuilder(ans.get(i)));
						ans.get(i).append(Character.toLowerCase(c));
						ans.get(i+n).append(Character.toUpperCase(c));
					}
				} else {
					for(int i = 0 ; i < n ; ++i) {
						ans.get(i).append(c);
					}
				}	
		}
		List<String> finalAns = new ArrayList<>();
		for(StringBuilder sb : ans) {
			finalAns.add(sb.toString());
		}
		return finalAns;
	}
	
	public static void main(String args[]) {
		System.out.println(letterPermutation("a"));
	}
	
}
