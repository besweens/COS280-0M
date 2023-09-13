/*
 * CLASS Fraction
 * Create fraction objects with numerator and denominator inputs
 * 
 * Authors:
 * Ben Sweeney,
 * 
 * Version:
 * 20230911
 * 
 */

public class Fraction implements INumber <T> {

	private int n;
	private int d;


	/**
	 * Constructor for Fraction objects
	 * @param numerator
	 * @param denominator
	 */
	public Fraction(int newNumerator, int newDenominator) {
		//super();
		this.n = newNumerator;
		this.d = newDenominator;
	}

	/**
	 * Default constructor
	 * @param numerator
	 * @param denominator
	 */
	public Fraction() {
		//super();
		this.n = 0;
		this.d = 0;
	}


	public Fraction plus(Fraction input) {

		return null;
	}


	public Fraction minus(Fraction input) {
		// TODO Auto-generated method stub
		return null;
	}


	public Fraction divide(Fraction input) {
		// TODO Auto-generated method stub
		return null;
	}


	public Fraction multiply(Fraction input) {
		// TODO Auto-generated method stub
		return null;
	}




	public int getNum() {
		return n;
	}

	public void setNum(int n) {
		this.n = n;
	}

	public int getD() {
		return d;
	}

	public void setD(int d) {
		this.d = d;
	}

	public void print() {
		// TODO Auto-generated method stub

	}

}
