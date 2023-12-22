package hdfc.loans.homeloans;


class Parent
{
	public  Number workhard()
	{
		System.out.println("parent : wakeup early,goto college...");
		return 0;
	}
	
	public void care()
	{
		System.out.println("parent : atmost care...");
	}
}

public class Child extends Parent
{
	public  Object workhard()
	{
		System.out.println("child : wakeup anytime,goto movie...");
		return 0;
	}
	
	public void love()
	{
		System.out.println("child : iam in love....");
	}

	public static void main(String[] args)
	{
		Child c = new Child();
		c.workhard();
		c.care();
		c.love();
	}

}
