import java.util.Arrays;

public class Code {

	public static String reverseOrder(String s) {
		StringBuffer str1 = new StringBuffer();
		StringBuffer str2 = new StringBuffer();
		String[] parse = s.split(" ");
		System.out.println(Arrays.toString(parse));

		for(int i = 0; i < parse.length ; i++) {
			for(int j = parse[i].length() -1; j >= 0 ; j--) {
				String f = parse[i];
				str1.append(f.charAt(j));

			}
			str2.append(str1+" ");
			str1.delete(0, str1.length());

		}
		str2.delete(str2.length(), str2.length());
		return str2.toString();

	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "hello World";
		String output = reverseOrder(a);
		System.out.println(output);
	}

}
