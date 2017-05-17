package day1;

public class CallTest {
//자바에서 reference type : 배열, class, interface
	public static void main(String[] args) {
		int x=3, y=4;
		int[] a={3}, b={4};
		CallTest test = new CallTest();
		test.changeVal(x, y);
		System.out.println(x + " " + y);
		test.changeRef(a, b);
		System.out.println(a[0] + " " + b[0]);
	}
	
	public void changeVal(int a, int b){//파라미터 타입이 primitive data type이면 call by value
		int temp = a;
		a = b;
		b = temp;
	}
	
	public void changeRef(int[] a, int[] b){//파라미터 타입이 reference data type이면 call by reference 방식으로 수행
		int temp = a[0];
		a[0] = b[0];
		b[0] = temp;
	}

}
