package pruebaGit;

public class Operaciones {

	private int operadorA;
	private int operadorB;
	
	
	public Operaciones( int operadorA, int operadorB) {
		super();
		this.operadorA=operadorA;
		this.operadorB=operadorB;
	}
	public int suma() {
		return operadorA+operadorB;
	}
	
	public int resta() {
		return operadorA-operadorB;
	}
	
	public int division() {
		return operadorA/operadorB;
	}
	
	public int getOperadorA() {
		return operadorA;
	}


	public void setOperadorA(int operadorA) {
		this.operadorA = operadorA;
	}


	public int getOperadorB() {
		return operadorB;
	}


	public void setOperadorB(int operadorB) {
		this.operadorB = operadorB;
	}
	
}
