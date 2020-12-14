/**
 by equals() method
 by == operator method
 by compareTo() method
 */

/**
 * @author DHARTI
 *
 */
public class comparison {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		/*By equals() method*/
		// TODO Auto-generated method stub
		String s1 = "Sachin";
		String s2 = "Sachin";
		String s3 = new String("Sachin");
		String s4 = "Saurav";	
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		System.out.println(s1.equalsIgnoreCase(s4));
		/*By == Operator Method*/
		/* System.out.println(s1==s2);
		 System.out.println(s1==s3);*/
		/*By CompareTo() Method*/
		/* System.out.println(s1.compareTo(s2));
		 System.out.println(s1.compareTo(s2));
		 System.out.println(s4.compareTo(s1)); */
	}

}
