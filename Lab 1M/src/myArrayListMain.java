/*
 * CLASS FractionMain
 * Test and output the results from operations on custom Fraction ArrayList objects
 * @author Ben Sweeney,Abby Pitcairn, Jere Perisic, Esther Mugish
 * 
 * @version 20230917
 */
public class myArrayListMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Fraction[] fractionArray = new Fraction[100];

//		for(int i=0; i<fractionArray.length; i++)
//			fractionArray[i] = new Fraction(i, i+1);
		
		System.out.println("Lab 1M - Custom Array Lists");
		
	}
	
	//=============TESTS================================================//


	/* testAdd
	 * Test that .add() actually
	 * @param inNumA Desired Fraction A numerator
	 * @param inDenA Desired Fraction A denominator
	 * @param inNumB Desired Fraction B numerator
	 * @param inDenB Desired Fraction B denominator
	 */
	public static void testAdd(myArrayList[] testArr, int inNumA, int inDenA) {
		int testNumA = inNumA;
		int testDenA = inDenA;
		Fraction testFracA = new Fraction(testNumA,testDenA);
		
		
		System.out.println("\n===========================================");
		System.out.println(".add() TEST");

		System.out.println("\n===========================================");
	}
	
	/* testRemove
	 * Test that .remove() actually
	 * @param inNumA Desired Fraction A numerator
	 * @param inDenA Desired Fraction A denominator
	 * @param inNumB Desired Fraction B numerator
	 * @param inDenB Desired Fraction B denominator
	 */
	public static void testRemove(myArrayList[] testArr, int inNumA, int inDenA) {
		int testNumA = inNumA;
		int testDenA = inDenA;
		Fraction testFracA = new Fraction(testNumA,testDenA);
		
		
		System.out.println("\n===========================================");
		System.out.println(".remove() TEST");

		System.out.println("\n===========================================");
	}
	
	/* testContains
	 * Test that .contains() actually
	 * @param inNumA Desired Fraction A numerator
	 * @param inDenA Desired Fraction A denominator
	 * @param inNumB Desired Fraction B numerator
	 * @param inDenB Desired Fraction B denominator
	 */
	public static void testContains(myArrayList[] testArr, int inNumA, int inDenA) {
		int testNumA = inNumA;
		int testDenA = inDenA;
		Fraction testFracA = new Fraction(testNumA,testDenA);
		
		
		System.out.println("\n===========================================");
		System.out.println(".contains() TEST");

		System.out.println("\n===========================================");
	}
}
