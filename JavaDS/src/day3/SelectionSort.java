package day3;

public class SelectionSort {

	public static void main(String[] args) {
		int[] numbers = {69,10,30,2,16,8,31,22};
		/*int[] numbers = {1,2,3,4,5};*/
		int minIndex = -1;
		
		for(int i=0; i<numbers.length-1; i++){
			minIndex = i;
			for(int k=i+1; k<numbers.length; k++){
				if(numbers[minIndex]>numbers[k]){
					minIndex = k;
				}
			}
	
			int temp = -1;
			temp = numbers[i];
			numbers[i] = numbers[minIndex];
			numbers[minIndex] = temp;
			
			for(int a : numbers){
				System.out.print(a + " ");
			}
			System.out.println();
		}
		
		
	}

}
