package day4;

public class radixSortTest {

	public static void main(String[] args) {		 
		int testArray[] = {69, 10, 30, 2, 16, 8, 31, 22};
		testArray = radixSort(testArray);
		printArray(testArray);
	}
	
	static int[] radixSort(int[] testArray){
		int sortedArray[] = new int[testArray.length];
		int k = 1;
		
		//1의 자리 수로 정렬
		for(int i = 0; i < 10; i++){
			for(int j = 1; j < testArray.length; j++){
				if((testArray[j] % 10) == i){
					sortedArray[k++] = testArray[j];
				}
			}
		}
		testArray = sortedArray;

		sortedArray = new int[testArray.length];
		k = 1;
		
		//10의 자리 수로 정렬
		for(int i = 0; i < 10 ; i++){
			for(int j = 1; j < testArray.length; j++){
				if((testArray[j] / 10) == i){
					sortedArray[k++] = testArray[j];
				}
			}
		}
		return sortedArray;
	}
	
	static void printArray(int[] testArray){
		for(int i = 1; i < testArray.length; i++){
			System.out.print(testArray[i] + " ");
		}
		System.out.println();
	}

}