import java.awt.List;
import java.util.ArrayList;

public class Solution_A {
	public static ArrayList<String> fizzbuzz (int n) {
		ArrayList<String> s = new ArrayList<String>(n);
		for(int i = 1 ; i < n ;i++) {
			if(i%3 == 0 && i%5 == 0) {
				s.add("FizzBuzz");
			}
			else if(i % 3 == 0) {
				s.add("Fizz");
			}
			else if(i % 5 == 0) {
				s.add("Buzz");
			}
			else{
				s.add(String.valueOf(i));
			}
		}
		return s;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =  90;
		ArrayList<String> k= fizzbuzz(n);
		System.out.println(k.toString());
	}

}
