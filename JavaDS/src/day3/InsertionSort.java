package day3;

public class InsertionSort {

	public static void main(String[] args) {
		int[] numbers = {69,10,30,2,16,8,31,22};
		int temp = 0;
		
		for(int i=1; i<numbers.length; i++){
			int k=i;
			while(k>0&&numbers[k-1]>numbers[k]){
				temp = numbers[k];
				numbers[k] = numbers[k-1];
				numbers[k-1] = temp;
				
				k--;
			}
		}
		
		for(int a : numbers){
			System.out.print(a + " ");
		}
		System.out.println();
	}

}
