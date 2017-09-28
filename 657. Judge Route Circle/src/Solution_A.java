
public class Solution_A {
	
	public static boolean judgeCircle(String moves) {
		int y = 0;
		int x = 0;
		
		for(int i = 0 ; i < moves.length() ; i ++) {
			switch (moves.charAt(i)) {
			
			case 'U' :
				y++;
				break;
				
			case 'D' :
				y--;
				break;
				
			case 'R' :
				x++;
				break;
			
			case 'L' :
				x--;
				break;
			}		
		}
		if(x == 0 && y == 0) {
			return true;
		} else {
			return false;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "UD";
		
		System.out.println(judgeCircle(test));
	}

}
