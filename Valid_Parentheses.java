import java.util.*;
class Valid_Parentheses{
	
	static boolean check_valid(String str){
		Stack<Character> stack=new Stack<>();
		
		for(int i=0;i<str.length();i++){
			if(str.charAt(i) == '(' || str.charAt(i) == '{' || str.charAt(i) == '[')
				stack.push(str.charAt(i));
			else{
				if(stack.isEmpty())
					return false;
				if(stack.peek() == '{' && str.charAt(i) == '}')
					stack.pop();
				else if(stack.peek() == '[' && str.charAt(i) == ']')
					stack.pop();
				else if(stack.peek() == '(' && str.charAt(i) == ')')
					stack.pop();
			}
		}
		if(stack.isEmpty())
			return true;
		return false;
	}
	public static void main(String[] arg){
		Scanner obj=new Scanner(System.in);
		
		String str=obj.nextLine();
		
		System.out.println(check_valid(str));
	}
}
