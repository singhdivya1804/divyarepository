package practiceonlyrevenue;

public class constructor {

//constructor me bas object banana hota hai call nahi karwana padta like method me refernce object into method karte hai ya reference object into global variable karte hai	


public constructor()
{
	System.out.println("i am default constructor");
}
	
public constructor(int a)
{
	System.out.println("i am one parameterized constructor");
}
	
public constructor(int a1, int b1)
{
	System.out.println("i am two parameterized constructor");
}
	
	
public constructor(int a2, int b2, int c2)
{
	System.out.println("i am three parameterized constructor");
}
	
	
public static void main(String[] args) {
	
	constructor obj=new constructor();
	constructor obj1=new constructor(10);
	constructor obj2=new constructor(11,12);
	constructor obj3=new constructor(13,14,15);
	
	
	
	
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
