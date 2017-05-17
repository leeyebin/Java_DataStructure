package day2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class SetTest {

	public static void main(String[] args) {
		String[] cars = new String[] { "아우디", "벤츠", "BMW", "마이바흐", "포르쉐" };
		HashSet<String> hset = new HashSet<String>();
		TreeSet<String> tset = new TreeSet<String>();
		for (String s : cars) {
			hset.add(s);
			tset.add(s);
		}

		Iterator<String> iter = hset.iterator();
		System.out.print("hashset => ");
		while (iter.hasNext()) {
			System.out.print(iter.next() + " ");
		}
		System.out.println();

		System.out.print("treeset => ");
		iter = tset.iterator();
		while (iter.hasNext()) {
			System.out.print(iter.next() + " ");
		}
	}

}
