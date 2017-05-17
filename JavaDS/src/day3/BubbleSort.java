package day3;

public class BubbleSort {

	public static void main(String[] args) {
		int[] numbers = {69,10,30,2,16,8,31,22};
		
		for(int i=numbers.length-1; i>=0; i--){
			for(int k=0; k<i; k++){
				if(numbers[k]>numbers[k+1]){
					int temp = -1;
					temp = numbers[k];
					numbers[k] = numbers[k+1];
					numbers[k+1] = temp;
				}
			}
		}
		for(int a : numbers){
			System.out.print(a + " ");
		}
		System.out.println();
	}

}
