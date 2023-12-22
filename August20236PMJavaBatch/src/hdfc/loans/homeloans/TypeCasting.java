package hdfc.loans.homeloans;

public class TypeCasting 
{

	public static void main(String[] args) 
	{
		//byte-1, short-2, int-4, long-8, float-4, double-8
		
		// 1-liter ---> 500ml  ---> There is no risk  ---> widening
		// 1-liter ---> 1.5ltr ---> There is risk(water overflow) ---> Narrowing
		
		//type casting from one primitive type to another primitive type
		
		int x1 = 10; 
		System.out.println(x1);
		
		//double x2 = (double)x1;
		double x2 = x1;
		System.out.println(x2);
		
		int x3 = (int)x2;
		System.out.println(x3);
		
		char c1 = 'a';
		System.out.println(c1);
		
		int c2 = (int)c1;
		System.out.println(c2);
		
		
		//type casting from one primitive type to corresponding wapperclass type
		
		int i1 = 100;
		System.out.println(i1);
		
		//Integer i2 = i1;
		Integer i2 = Integer.valueOf(i1);
		System.out.println(i2);
		
		int i3 = (int)i2;
		System.out.println(i3);
		
		//type casting from one wapperclass type type to another wapperclass type
		String s1 = "200";
		String s2 = "300";
		System.out.println(s1+s2);
		
		float f1 = Float.parseFloat(s1);
		float f2 = Float.parseFloat(s2);
		System.out.println(f1+f2);
		
		int fp1 = Integer.parseInt(s1);
		int fp2 = Integer.parseInt(s2);
		System.out.println(fp1+fp2);
		
		Integer p1 = Integer.valueOf(fp1);
		Integer p2 = Integer.valueOf(fp2);
		System.out.println(p1+p2);
		
	}

}
