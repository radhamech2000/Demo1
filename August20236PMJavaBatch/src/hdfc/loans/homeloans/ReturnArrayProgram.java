package hdfc.loans.homeloans;

import java.util.Arrays;

public class ReturnArrayProgram 
{

	public int[] elements()
	{
		int[] x = new int[] {10,20,30,40};
		
		int a = 10;
		int b = 20;
		int c = 30;
		return new int[] {a,b,c};
		
	}
	
	public static void main(String[] args) 
	{
		ReturnArrayProgram obj = new ReturnArrayProgram();
		int[] val = obj.elements();
		System.out.println(Arrays.toString(val));
	}

}
