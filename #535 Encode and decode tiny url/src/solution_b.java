import java.util.HashMap;
import java.util.Map;

public class solution_b {
	static Map<Integer, String> map = new HashMap<>();
	public static String encode(String longUrl) {
		map.put(longUrl.hashCode(),longUrl);
		return "http://tinyurl.com/"+longUrl.hashCode();
		
	}
	public static String decode(String shortUrl) {
		return map.get(Integer.parseInt(shortUrl.replace("http://tinyurl.com/", "")));
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(encode("google.com"));
		System.out.println(decode("http://tinyurl.com/-1536293812"));
	}

}
