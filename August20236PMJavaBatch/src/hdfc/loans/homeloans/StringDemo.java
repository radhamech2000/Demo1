package hdfc.loans.homeloans;

public class StringDemo 
{

	public static void main(String[] args) 
	{
		String s1 = "ravikanth";
		System.out.println(s1);
		System.out.println(s1.length());
		System.out.println(s1.isEmpty());
		System.out.println(s1.charAt(2));
		System.out.println(s1.indexOf('v'));
		System.out.println(s1.startsWith("ravi"));
		System.out.println(s1.endsWith("nth"));
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		
		String s2 = new String("lella");
		System.out.println(s2);
		
		//System.out.println(s1+s2);
		System.out.println(s1.concat(s2));
		
		System.out.println(s1.equals(s2));
		String s3 = " Ravikanth";
		System.out.println(s3);
		System.out.println(s1.equals(s3));
		System.out.println(s1.equalsIgnoreCase(s3));
		
		String s4 = "ravi";
		System.out.println(s4);
		System.out.println(s1.contains(s4));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s3.trim()));
		System.out.println(s1.equalsIgnoreCase(s3.trim()));
		System.out.println(s1.equals(s3.trim().toLowerCase()));
		
		System.out.println(s1.substring(2, 7));
		
		System.out.println(s1);
		System.out.println(s1.replace('r', 'k'));
		
		String s5 = "ravi kanth lella";
		System.out.println(s5);
		String[] str = s5.split(" ");
		for(String s:str)
		{
			System.out.println(s);
		}
	}

}
