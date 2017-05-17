package day1;

public class CallTest {
//�ڹٿ��� reference type : �迭, class, interface
	public static void main(String[] args) {
		int x=3, y=4;
		int[] a={3}, b={4};
		CallTest test = new CallTest();
		test.changeVal(x, y);
		System.out.println(x + " " + y);
		test.changeRef(a, b);
		System.out.println(a[0] + " " + b[0]);
	}
	
	public void changeVal(int a, int b){//�Ķ���� Ÿ���� primitive data type�̸� call by value
		int temp = a;
		a = b;
		b = temp;
	}
	
	public void changeRef(int[] a, int[] b){//�Ķ���� Ÿ���� reference data type�̸� call by reference ������� ����
		int temp = a[0];
		a[0] = b[0];
		b[0] = temp;
	}

}
