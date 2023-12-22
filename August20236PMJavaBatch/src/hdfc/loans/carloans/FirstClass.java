package hdfc.loans.carloans;

public class FirstClass 
{
	// data Properties
	int a=10, b=20,c;
	
	// Behaviours
	public void add()
	{
		c = a+b;
		System.out.println("Add of A & B is : " +  c);
	}
	
	public void sub()
	{
		c = a-b;
		System.out.println("sub of A & B is : "+ c);
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Hello");
		
		int x = 100;
		char ch = 'a';
		
		FirstClass obj = new FirstClass();
		obj.add();
		obj.sub();
		
		FirstClass obj1 = new FirstClass();
		obj1.add();
		obj1.sub();
	}
}
