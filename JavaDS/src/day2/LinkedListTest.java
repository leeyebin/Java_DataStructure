package day2;

import java.util.Iterator;
import java.util.LinkedList;

//java.util.List �������̽� - ArrayList, Vector, LinkedList, Queue, Stack
//��Ұ� ����� ������ ����, �ߺ� ��ü ���� ���

public class LinkedListTest {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList();
		String[] cars = new String[]{"�ƿ��", "����", "BMW", "���̹���", "������"};
		for(String s : cars){
			list.add(s);
		}
		
		Iterator<String> iter = list.iterator();
		while(iter.hasNext()){
			System.out.println(iter.next());
		}
	}

}
