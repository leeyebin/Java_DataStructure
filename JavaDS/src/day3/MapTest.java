package day3;

import java.util.Iterator;
import java.util.TreeMap;

public class MapTest {

	public static void main(String[] args) {
		String[] cars = new String[]{"아우디", "벤츠", "BMW", "마이바흐", "포르쉐"};
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		
		for(int i=0; i<cars.length; i++){
			int rnum = (int)(Math.random()*6+1);
			map.put(new Integer((i+rnum*100+3000)), cars[i]);
		}
		
		//Set<Integer> keys = map.keySet();
		Iterator<Integer> iter = map.keySet().iterator();
		
		while(iter.hasNext()){
			Integer key = iter.next();
			String value = map.get(key);
			System.out.println(key+"cc, "+value);
		}

	}

}
