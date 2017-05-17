package day2;

import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		Stack<String> list = new Stack();
		String[] cars = new String[]{"�ƿ��", "����", "BMW", "���̹���", "������"};
		for(String s : cars){
			list.push(s);
		}
		
		while(!list.isEmpty()){
			System.out.println(list.pop() + ", ���� ��� " + list.size());
		}
	}

}
