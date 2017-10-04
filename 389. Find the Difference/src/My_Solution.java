
public class My_Solution {
	
	public static char findTheDifference(String s, String t) {
		
		 int charCode = t.charAt(s.length());
	        // Iterate through both strings and char codes
	        for (int i = 0; i < s.length(); ++i) {
	              charCode -= (int)s.charAt(i);
	              charCode += (int)t.charAt(i); 
	        }
	        return (char)charCode;
        
    }

	public static void main(String[] args) {
		String s = "abcd";
		String t = "bacde";
		
		System.out.println(findTheDifference(s, t));
		System.out.println((int)t.charAt(4));
	}

}
