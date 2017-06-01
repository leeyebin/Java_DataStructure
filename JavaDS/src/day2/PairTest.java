package day2;

import java.util.Scanner;
import java.util.Stack;

public class PairTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("입력 : ");
		String sentence = scanner.next();
		
		System.out.println(check(sentence));

	}
	
	public static boolean check(String sentence){
		Stack<Character> stack = new Stack();
		
		for(int i=0; i<sentence.length(); i++){
			switch(sentence.charAt(i)){
			case '{':
			case '(':
			case '[': stack.push(sentence.charAt(i)); break;
			case '}':
				if(!stack.isEmpty()){
					if(stack.peek()=='{'){
						stack.pop();
					}else{
						return false;
					}
				}
				break;
			case ')':
				if(!stack.isEmpty()){
					if(stack.peek()=='('){
						stack.pop();
					}else{
						return false;
					}
				}
				break;
			case ']':
				if(!stack.isEmpty()){
					if(stack.peek()=='['){
						stack.pop();
					}else{
						return false;
					}
				}
				break;
			}
		}
		
		if(stack.isEmpty()){
			return true;
		}else{
			return false;
		}
		
	}

}
