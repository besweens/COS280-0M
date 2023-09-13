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
		if (newDenominator == 0)
			throw new IllegalArgumentException("Denominator cannot be zero");
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

	@Override
	public Fraction divide(Fraction input) {
		return new Fraction((this.n * input.getD()), (this.d * input.getNum());
	}

	@Override
	public Fraction multiply(Fraction input) {
		return new Fraction((this.n * input.getNum()), (this.d * input.getD());
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

	
	/** Find the smallest value in an array of Fractions
	 * @param input: the Fraction array to find the minimum from
	 * @return min: the smallest Fraction in the array input
	 */
	Fraction findMin(Fraction[] input) {
		Fraction min = input[0];
		for (int i = 1; i < input.length; ++i) 
			if (min.compareTo(input[i]) == -1) //check this -1 variable when compareTo method comes through
				min = input[i];
		return min;
	}
	/** Find the largest value in an array of Fractions
	 * @param input: the Fraction array to find the maximum from
	 * @return max: the largest Fraction in the array input
	 */
	Fraction findMax(Fraction[] input) {
		Fraction max = input[0];
		for (int i = 1; i < input.length; ++i) 
			if (max.compareTo(input[i]) == 1) //check this 1 variable when compareTo method comes through
				max = input[i];
		return max;
	}


	
	public void print() {

	}

}
