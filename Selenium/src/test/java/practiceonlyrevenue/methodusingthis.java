package practiceonlyrevenue;

public class methodusingthis {

	//3d124 method k case me ye sidha chalta hai
	
	public void method1()
	{
		System.out.println("default");
		this.method2();
		
	}
	
	public void method2()
	{
		System.out.println("one");
		this.method3();
	}
	
	
	public void method3()
	{
		System.out.println("two");
		this.method5();
	}
	
	public void method4()
	{
		System.out.println("three");
		this.method1();
		
	}
	
	public void method5()
	{
		System.out.println("four");
	}
	
	public static void main(String[] args) {
		methodusingthis obj=new methodusingthis();
		obj.method4();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
