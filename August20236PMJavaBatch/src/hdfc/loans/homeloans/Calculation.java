package hdfc.loans.homeloans;

public class Calculation 
{
	
	int a,b,c;
	
	public Calculation(int a, int b) 
	{
		super();
		this.a = a;
		this.b = b;
	}
	
	public void add()
	{
		c = a+b;
		System.out.println("Add of A & B is : " +  c);
	}

	public void sub()
	{
		c= a-b;
		System.out.println("Sub of A & B is : " +  c);
	}

	public static void main(String[] args) 
	{
		Calculation obj = new Calculation(100, 200);
		obj.add();
		obj.sub();
	}

}
