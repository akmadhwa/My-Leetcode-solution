
public class Solution_B_Optimal {
	private static int[] scores;
	private static int size;
	
	public static int calPoints(String[] ops) {
		size = 0;
		scores = new int[ops.length];
		int sum = 0;
		for(String op : ops) {
			if(op.charAt(0) == 'C' && size > 0) {
				size--;
				sum -= scores[size];
				
			} else if (op.charAt(0) == 'D') {
				scores[size] =2 *  scores[size-1];
				sum += scores[size];
				size++;
			} else if (op.charAt(0) == '+' && size > 1) {
				scores[size] = scores[size - 1] + scores[size - 2];
				sum  += scores[size];
				size++;
			} else {
				scores[size] = Integer.parseInt(op);
				sum += scores[size];
				size++;
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
		String[] testing = {"1","2","+"};
		System.out.println(calPoints(testing));
	}

}
