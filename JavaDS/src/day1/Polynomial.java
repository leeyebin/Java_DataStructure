package day1;

public class Polynomial {
	private int[] coef;
	private int exp;
	
	public Polynomial(int exp, int[] coef) {
		super();
		this.coef = coef;
		this.exp = exp;
	}

	public int[] getCoef() {
		return coef;
	}

	public void setCoef(int[] coef) {
		this.coef = coef;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}
	
	public void printPoly(){
		for(int i=0; i<this.coef.length; i++){
			System.out.print(this.coef[i] + " ");
		}
		
	}

	
}
