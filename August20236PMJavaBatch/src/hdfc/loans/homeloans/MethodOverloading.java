package hdfc.loans.homeloans;

public class MethodOverloading 
{

	//A class cannot contain 2 same methods with same signatures, otherwise it’s a CE.
	
	/*public void m1(int x)
	{
		System.out.println(x);
	}*/
	
	/*public void m1(float f)
	{
		System.out.println(f);
	}*/
	
	/*public void m1(String f)
	{
		System.out.println(f);
	}*/
	
	/*public void m1(Number f)
	{
		System.out.println(f);
	}*/
	
	/*public void m1(Integer f)
	{
		System.out.println(f);
	}*/
	
	public void m1(Object f)
	{
		System.out.println(f);
	}
	
	
	public static void main(String[] args)
	{
		MethodOverloading obj = new MethodOverloading();
		obj.m1(1000);
		obj.m1(12.34f);
		obj.m1("ravi");
		obj.m1(100);
		obj.m1(23.45f);
		obj.m1("sai");
	}

}
