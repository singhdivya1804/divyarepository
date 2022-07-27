package practiceonlyrevenue;

public class constructorusingthis {
//assignment 3d124 will be serial /// ye ulta chalta hai
	//this keyword is used for calling fron one constructor to other
	public constructorusingthis()
	{
		this(5,4,6);
	System.out.println("default");	
	}
	
	public constructorusingthis(int a)
	{
	this();	
	System.out.println("one");	
	}
	
	public constructorusingthis(int a1,int b1)
	{
		
	this(13);
		System.out.println("two");
	}
	
	public constructorusingthis(int a2,int b2,int c2)
	{
		
		System.out.println("three");
	}
	
	public constructorusingthis(int a3,int b3, int c3,int d3)
	{
		this(14,15);
		System.out.println("four");
	}
	
	public static void main(String[] args) {
		
		constructorusingthis obj=new constructorusingthis(6,18,19,22);	 //control will go from four ye ulta chalta hai
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
