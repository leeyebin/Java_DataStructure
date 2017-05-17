package day2;

import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		Stack<String> list = new Stack();
		String[] cars = new String[]{"아우디", "벤츠", "BMW", "마이바흐", "포르쉐"};
		for(String s : cars){
			list.push(s);
		}
		
		while(!list.isEmpty()){
			System.out.println(list.pop() + ", 남은 요소 " + list.size());
		}
	}

}
