package day1;

public class PolyTest {

	public static void main(String[] args) {
		 int a[]= new int[] {4,3,5,0};
         int b[]= new int[] {3,1,0,2,1};
         Polynomial A = new Polynomial(3, a);
         Polynomial B = new Polynomial(4, b);
         OperatePoly optPoly = new OperatePoly();
         Polynomial C = optPoly.addPoly(A,B);
         System.out.printf("A(x)="); A.printPoly();
         System.out.printf("B(x)="); B.printPoly();
         System.out.printf("C(x)="); C.printPoly();

	}

}
