import java.util.Stack;

public class Solution_A {

	public static int calPoints(String[] ops) {
		Stack<Integer> listInt = new Stack<>();
		int total = 0;
		int temp;
		
        for(String a : ops ) {
        	
        	if (isInteger(a)) {
        		listInt.push(Integer.parseInt(a));
        		total+=Integer.parseInt(a);
        	} else { 
        		if(a.equals("C")) {
        			total-=listInt.pop();
        		}
        		else if(a.equals("D")) {
        			listInt.push(listInt.peek()*2);
        			total+=(listInt.peek());
        		}
        		else if(a.equals("+")) {
        			int poptemp = listInt.pop();
        			temp = poptemp+listInt.peek();
        			listInt.push(poptemp);
        			listInt.push(temp);
        			total+=temp;
        		}
        		
        	}
        	System.out.println(total);
        }
        return total;
    }
	
	public static boolean isInteger(String s) {
	      boolean isValidInteger = false;
	      try
	      {
	         Integer.parseInt(s);
	 
	         // s is a valid integer
	 
	         isValidInteger = true;
	      }
	      catch (NumberFormatException ex)
	      {
	         isValidInteger = false;
	      }
	 
	      return isValidInteger;
	   }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] test = {"5","-2","4","C","D","9","+","+"};
		System.out.println(calPoints(test));
	}

}
