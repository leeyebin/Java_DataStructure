package day4;
//이해가 잘 안되어 다시 짜봄
public class RadixSort {

	public static void main(String[] args) {
		int testArray[] = {69, 10, 30, 2, 16, 8, 31, 22};
		int[] tempArray = new int[testArray.length]; 
		int k=0;
		
		for(int i=0; i<10; i++){
			for(int j=0; j<testArray.length; j++){
				if(testArray[j]%10==i){
					tempArray[k++]=testArray[j];
				}
			}
		}
		System.out.print("1의자리 정리 끝 : ");
		for(int a : tempArray){
			System.out.print(a + " ");
		}System.out.println();
		k=0;
		testArray = tempArray.clone();
		
		for(int i=0; i<10; i++){
			for(int j=0; j<testArray.length; j++){
				if(testArray[j]/10==i){
					tempArray[k++]=testArray[j];
				}
			}
		}
		System.out.print("10의자리 정리 끝 : ");
		for(int a : tempArray){
			System.out.print(a + " ");
		}
	}

}
