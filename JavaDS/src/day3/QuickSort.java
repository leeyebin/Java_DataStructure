package day3;

public class QuickSort {

	public static void main(String[] args) {
		//수정할 것
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
			while(numbers[l]<numbers[pivot]&&l<r){
				l++;
			}
			while(numbers[r]<numbers[pivot]&&l<r){
				r++;
			}
			
			if(l<r){
				temp = numbers[l];
				numbers[l] = numbers[r];
				numbers[r] = temp;
			}
		}while(l<r);
		temp = numbers[pivot];
		numbers[pivot] = numbers[r];
		numbers[r] = temp;
		
		if(l < right) sort(numbers, l, right);
        if(r > left) sort(numbers, left, r);

	}

}
