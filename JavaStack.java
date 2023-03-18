//https://www.hackerrank.com/challenges/java-stack/problem?isFullScreen=true
	import java.util.*;
	public class JavaStack {
		public static void main(String []argh){
			Scanner sc = new Scanner(System.in);
			
			while (sc.hasNext()) {
				String input=sc.next();
				System.out.println(isbalanced(input));
			}
		}
		public static boolean isbalanced(String input){
			Stack<Character> st=new Stack <Character>();
			for(int i=0 ; i<input.length();i++){
				if(input.charAt(i)=='(' || input.charAt(i)=='[' || input.charAt(i)=='{'){
				st.push(input.charAt(i));
				}else if(st.empty()){
					return false;
				}else{
					char top=st.pop();
					if(top=='(' && input.charAt(i)!=')' || top=='[' && input.charAt(i)!=']' || top=='{' && input.charAt(i)!='}' )
					return false;
				}
			}
						return st.empty();        
		}
		
		  static boolean isBalanced(String parentheses) {
	 Stack <Character> stack = new Stack<Character>();
				for (int i = 0; i < parentheses.length(); i++) {
					char ch = parentheses.charAt(i);
					if (ch == '(' || ch == '[' || ch == '{') {
						stack.push(ch);
					} else if (stack.empty()) {
						return false;
					} else {
						char top = stack.pop();
						if ((top == '(' && ch != ')') || (top == '[' && ch != ']')
								|| (top == '{' && ch != '}')) {
							return false;
						}
					}
				}
				return stack.empty();
			}
		}
	