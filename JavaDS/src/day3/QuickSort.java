package day3;

public class QuickSort {

	public static void main(String[] args) {
		int[] numbers = {69,10,30,2,16,8,31,22};
		
		QuickSort Quick = new QuickSort();
		Quick.sort(numbers, 0, numbers.length-1);
		
		for(int a : numbers){
			System.out.print(a + " ");
		}
		System.out.println();

	}
	
	public void sort(int[] numbers, int l, int r){
		int pivot = (l + r)/2;
		int left = l;
		int right = r;
		int temp = -1;
		
		do{
			while(numbers[left]<numbers[pivot]&&left<right){
				left++;
			}
			while(numbers[right]>=numbers[pivot]&&left<right){
				right--;
			}
			
			if(left<right){
				temp = numbers[left];
				numbers[left] = numbers[right];
				numbers[right] = temp;
			}
		}while(left<right);
		
		temp = numbers[pivot];
		numbers[pivot] = numbers[right];
		numbers[right] = temp;
		
		if(l < right) sort(numbers, l, right-1);
        if(r > left) sort(numbers, left+1, r);
	}

}
