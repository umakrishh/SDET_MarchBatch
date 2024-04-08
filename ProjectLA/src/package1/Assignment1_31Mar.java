package package1;

//Assignment for the Arithmetic Operation: (((((10+2)+2)-2)*2)/2)

public class Assignment1_31Mar {
	public int sum(int a,int b)
	{
		int c = a+b;
		System.out.println("Sum Result: "+c);
		return c;
	}
	public int sub(int x,int y)
	{
		int z = x-y;
		System.out.println("Subraction Result: "+z);
		return z;
	}
	public int mul(int l,int m)
	{
		int n = l*m;
		System.out.println("Multiplication Result: "+n);
		return n;
	}
	public void div(int p,int q)
	{
		int r = p/q;
		System.out.println("Division Result: "+r);
	}
	public static void main(String[] args) {
		Assignment1_31Mar result = new Assignment1_31Mar();
		int Sum_result = result.sum(10,2);
		int Sum_result1 = result.sum(Sum_result,2);
		int Sub_result = result.sub(Sum_result1,2);
		int Mul_result = result.mul(Sub_result,2);
		result.div(Mul_result,2);
		
	}

}
