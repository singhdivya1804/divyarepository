package practiceonlyrevenue;

public class assignment4 {

	
		public int div(int d,int e)
		{
			int f;
			f=d/e;
			System.out.println("result of div is" +f);
			return f;	
				
		}
		
		 public int sub(int x,int y)
			{
			   int z;
			   z=x-y;
			   System.out.println("result of sub is "+z);
			   return z;	
			}
		 
		 
		 public int sum(int a,int b)
			{
				int c;
				c=a+b;
				System.out.println("result of sum is "+c);
				return c;
				////////////    
			}
		 
		 
		public int multi(int p,int q)
		{
			int r;
			r=p*q;
			System.out.println("final result is" +r);
			return r;	
		}
		public static void main(String[] args) {
				
			
			assignment4 obj=new assignment4();
			int divresult= obj.div(10, 2);
			int subresult= obj.sub(divresult, 2);
			int subResult= obj.sub(subresult, 2);
			int sumresult= obj.sum(subResult, 2);
			int multiresult= obj.multi(sumresult, 2);
	
			
			
			
			
			
			
			
			
			
			
			
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
