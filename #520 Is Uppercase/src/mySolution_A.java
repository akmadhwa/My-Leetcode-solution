
public class mySolution_A {
	public static boolean uppercaseCheck(String s) {
		if(s.length() != 1 && Character.isUpperCase(s.charAt(0)) && Character.isLowerCase(s.charAt(1))){
			for(int i = 2 ; i < s.length() ; i++) {
				if(Character.isUpperCase(s.charAt(i))){
					return false;
				}
			}
			return true;

		}

		if(Character.isUpperCase(s.charAt(0))){
			for(int i = 2 ; i < s.length() ; i++) {
				if(Character.isLowerCase(s.charAt(i))){
					return false;
				}
			}
			return true;

		}

		if(Character.isLowerCase(s.charAt(0))){
			for(int i = 2 ; i < s.length() ; i++) {
				if(Character.isUpperCase(s.charAt(i))){
					return false;
				}
			}
			return true;

		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "a";
		boolean check = uppercaseCheck(s);
		System.out.println(s + ", "+check);

	}

}
