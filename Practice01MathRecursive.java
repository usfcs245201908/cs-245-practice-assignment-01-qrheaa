public class Practice01MathRecursive implements Practice01Math
{
	// public void main(String[] args)
	// {
	// 	System.out.println(fact(4));
	// 	System.out.println(fib(4));
	// }

	public int fib(int n) {
		try {
			if(n<0) {
				throw new IllegalArgumentException("Only Positive Numbers.");
			}
		}

		catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}

		if(n==0||n==1) {
			return n;
		}
		
		return fib(n-1)+fib(n-2);
	}

	public int fact(int n)
	{
		if(n<0) {
			throw new IllegalArgumentException("Only Positive Numbers.");
		}

		int fact = 1;
		if (n == 0) {
			return 1; 
		}

		return (n*fact(n-1)); 
	}

}