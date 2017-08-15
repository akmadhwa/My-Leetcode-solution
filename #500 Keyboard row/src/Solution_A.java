import java.awt.List;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;

public class Solution_A {

	public static String[] keyboardRow(String[] s) {
		String[] keyboard = {"QWERTYUIOP", "ASDFGHJKL", "ZXCVBNM"};
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for(int i = 0 ; i < keyboard.length ; i++) {
			for(char c : keyboard[i].toCharArray()) {
				map.put(c, i);

			}
		}
		LinkedList<String> list = new LinkedList<String>();
		for(String w : s) {
			if(w == "") {
				continue;

			}
			int index = map.get(w.toUpperCase().charAt(0));
			for(char c : w.toUpperCase().toCharArray()) {
				if(index != map.get(c)) {
					index = -1;
					break;
				}
			}
			if(index != -1) {
				list.add(w);
			}

		}
		return list.toArray(new String[0]);
	}

	public static void main(String[] args) {
		String[] a = {"qweqwe","fkjsadq"};
		System.out.println(Arrays.toString(keyboardRow(a)));

	}

}
