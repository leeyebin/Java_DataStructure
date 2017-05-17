package day1;

public class OperatePoly {
	@SuppressWarnings("null")
	public Polynomial addPoly(Polynomial A, Polynomial B){
		Polynomial C = null;
		//다항식 C는 A와 B 다항식의 지수를 비교해서 큰값이 다항식 C의 지수
		int[] c = A.getCoef();
		int[] d = B.getCoef();
		int[] e;
		
		if(c.length<d.length){
			e = new int[d.length-1];
			int k = 0;
			for(int i=d.length-c.length; i<d.length; i++){
				d[i] += c[k];
				k++;
			}
			C.setCoef(d);
		}else if(c.length>d.length){
			e = new int[c.length-1];
			int j = 0;
			for(int i=c.length-d.length; i<c.length; i++){
				c[i] += d[j];
				j++;
			}
			C.setCoef(c);
			
		}else if(c.length==d.length){
			e = new int[c.length-1];
			for(int i=0; i<c.length; i++){
				e[i]=c[i]+d[i];
			}
			C.setCoef(e);
		}
		
		return C;
	}
	
}
