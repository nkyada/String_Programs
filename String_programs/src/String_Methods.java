
public class String_Methods 
{

	public static void main(String[] args) 
	{
		
		String s1 = "Sachin";
		int a = 10;
		String s = String.valueOf(a);
		String s2 = s1.intern();
		String s3 = "Java is a programming language.Java is a platform.java is an Island";
		String replaceString = s3.replace("Java", "Kava");
		
		/*uppercase()&lowercase()*/
		
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s1);
		
		/*String trim()*/
		
		System.out.println(s1);
		System.out.println(s1.trim());
		
		/*startwith() & endwith()*/
	
		System.out.println(s1.startsWith("Sa"));
		System.out.println(s1.endsWith("n"));
		
		/*charAt()*/
		
		System.out.println(s1.charAt(0));
		System.out.println(s1.charAt(3));
		
		/*length() method*/
		
		System.out.println(s1.length());
		
		/*String intern() method*/
		
		System.out.println(s2);
		
		/*String valueOf() method*/
		
		System.out.println(s+10);
		
		/* String Replace() method*/
		
		System.out.println(replaceString);
	}

}
