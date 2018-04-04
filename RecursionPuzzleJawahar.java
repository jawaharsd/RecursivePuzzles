package recursionPuzzles;

public class RecursionPuzzleJawahar {
	
	private static int Sum (int n) {
		// Replace the following function with the recursive function to be tested
		if (n == 1) return 1;
		return (n+ Sum(n-1));
	}

	public static void main(String [] args) {
		// Local variables used for testing
		int actualResult;
		int expectedResult;
		
		// Test Number 1
		actualResult = Sum(5);	// Test the Base Case
		expectedResult = 15;					// Replace this line with what the actual expected result should be
		if (actualResult == expectedResult)
			System.out.println("Test 1: Pass; Result: " + actualResult);
		else
			System.out.println("Test 1: Fail; Result: " + actualResult + "; Expected: " + expectedResult);

		// Test Number 2
		actualResult = Sum(7);	// Test one away from the Base Case
		expectedResult = 28;				// Replace this line with what the actual expected result should be
		if (actualResult == expectedResult)
			System.out.println("Test 2: Pass; Result: " + actualResult);
		else
			System.out.println("Test 2: Fail; Result: " + actualResult + "; Expected: " + expectedResult);

		// Test Number 3
		actualResult = Sum(10);	// Test a number of iterations away from the Base Case
		expectedResult = 55;			// Replace this line with what the actual expected result should be
		if (actualResult == expectedResult)
			System.out.println("Test 3: Pass; Result: " + actualResult);
		else
			System.out.println("Test 3: Fail; Result: " + actualResult + "; Expected: " + expectedResult);
	}


}
