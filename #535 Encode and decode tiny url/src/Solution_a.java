import java.util.*;

public class Solution_a {
	 static Map<Integer, String> map = new HashMap<>();
	 static int  i = 0;
	
	 public static String encode(String longurl) {
		map.put(i, longurl);
		return "http://tinyurl.com/"+i++;
	}
	 
	public static String decode(String shorturl) {
		return map.get(Integer.parseInt(shorturl.replace("http://tinyurl.com/", "")));
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(encode("google.com"));
		System.out.println(decode("http://tinyurl.com/0"));
//		System.out.println(decode("google.com"));
//		System.out.println(decode("google.com"));
	}

}
