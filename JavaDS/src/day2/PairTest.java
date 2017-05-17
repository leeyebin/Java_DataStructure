package day2;

import java.util.Scanner;
import java.util.Stack;

public class PairTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("ют╥б : ");
		Stack<Character> stack = new Stack();
		String sentence = scanner.next();
		for(int i=0; i<sentence.length(); i++){
			switch(sentence.charAt(i)){
			case '{':
			case '(':
			case '[': stack.push(sentence.charAt(i)); break;
			case '}':
				if(stack.peek()=='{'){
					stack.pop();
				}
				break;
			case ')':
				if(stack.peek()=='('){
					stack.pop();
				}
				break;
			case ']':
				if(stack.peek()=='['){
					stack.pop();
				}
				break;
			}
		}
		
		if(stack.empty()){
			System.out.println("true");
		}else{
			System.out.println("false");
		}

	}

}
