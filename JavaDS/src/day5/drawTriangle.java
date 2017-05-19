package day5;

public class drawTriangle {

	public static void main(String[] args) {
		drawTriangle1(10);
	}

	static public void drawTriangle1(int lineNumber) {
		int lineNum = lineNumber;//라인 수
		int totalCount = 4 * (lineNum - 1);//총 숫자 갯수
		int lineCount = 1;//시작 라인수

		for (int i = 0; i < totalCount; i++) {
			if (i == 0) {
				for (int i1 = 0; i1 < lineNum - 1; i1++) {
					System.out.print(" ");
				}
				System.out.println("0");
				lineCount++;
			} else {
				if (lineCount != lineNum) {
					if(i%2==1){
						for(int k=0; k<lineNum-lineCount; k++){
							System.out.print(" ");
						}
						System.out.print(i % 10);
					}else if(i%2==0) {
						for(int l=0; l<2*lineCount-3; l++){
							System.out.print(" ");
						}
						System.out.print(i % 10);
						System.out.println();
						lineCount++;
					}
				}else{
					System.out.print(i % 10);
				}

			}
		}
	}

}
