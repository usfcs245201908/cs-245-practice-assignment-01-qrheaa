public class Practice01MathIterative implements Practice01Math {

	// public void main(String[] args) {

	// 	System.out.println(fact(4));
	// 	System.out.println(fib(4));

	// }

	public int fib(int n) {
		int prev = 0, current = 1; //0,1,1,etc.

		//consider negative case of fib.
		try {
			if(n<0) {
				throw new IllegalArgumentException("Only Positive Numbers.");
			}	
		}

		catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}

		for(int i = 1; i <=n; i++) {
			int prevprev = prev;
			prev = current; //move to next terms in fib sequence and update variables

			current = prevprev + prev; //sum of previous 2 terms
		}
		return prev;
	}

	public int fact(int n) {
		int fact = 1;

		if(n<0) {
			throw new IllegalArgumentException("Only Positive Numbers.");
		}

		for(int i = 1; i<=n; i++) {
			fact *= i;
		}

		return fact;
	}

}