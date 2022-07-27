package practiceonlyrevenue;

public class assignment3 {
/////// ((((10+2)+2)-2)2)/2)    this is assignment

	
	public int sum(int a,int b)
{
	int c;
	c=a+b;
	System.out.println("result of sum is "+c);
	return c;
	////////////    
}

   public int sub(int a1,int b1)
{
   int c1;
   c1=a1-b1;
   System.out.println("result of sub is "+c1);
   return c1;	
}
	public int multi(int a2,int b2)
	{
		int c2;
		c2=a2*b2;
		System.out.println("result of multi is" +c2);
		return c2;	
	}
	
	public int div(int a3, int b3)
	{
		int c3;
		c3=a3/b3;
		System.out.println("final result is div" +c3);
		return c3;
			
	}
	
	
	public static void main(String[] args) {
		
		assignment3 ob=new assignment3();
		int x1= ob.sum(10, 2);
		int x2= ob.sum(x1,2);
		int x3= ob.sub(x2, 2);
		int x4= ob.multi(x3, 2);
	    int x5= ob.div(x4, 2);
	    System.out.println(+x5);
	    
	    
	
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
