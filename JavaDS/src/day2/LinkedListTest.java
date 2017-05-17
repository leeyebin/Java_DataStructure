package day2;

import java.util.Iterator;
import java.util.LinkedList;

//java.util.List 인터페이스 - ArrayList, Vector, LinkedList, Queue, Stack
//요소가 저장된 순서를 보장, 중복 객체 저장 허용

public class LinkedListTest {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList();
		String[] cars = new String[]{"아우디", "벤츠", "BMW", "마이바흐", "포르쉐"};
		for(String s : cars){
			list.add(s);
		}
		
		Iterator<String> iter = list.iterator();
		while(iter.hasNext()){
			System.out.println(iter.next());
		}
	}

}
