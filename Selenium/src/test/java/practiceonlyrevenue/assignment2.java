package practiceonlyrevenue;

public class assignment2 {
	
	
	public int sum (int a, int b)
	{
		
		int c;
		c=a+b;
		System.out.println("result is sum "+c);
		return c;
	}

	
	public int sub(int x,int y)
	{
		int z;
		z=x-y;
		System.out.println("result is sub "+z);
		return z;
			
	}
	
	public void multi(int p,int q)
	{
		int r;
		r=p*q;
		System.out.println("final result is "+r);
		
	}
	
	
	public static void main(String[] args) {
		
		assignment2 ob=new assignment2();
		int sumresult=ob.sum(10, 2);
		int subresult=ob.sub(10, 2);
		ob.multi(sumresult, subresult);
		
		
	
			
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
