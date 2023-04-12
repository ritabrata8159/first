import java.util.Scanner;
class Q5
{
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter one string ");
		String a=obj.nextLine();
		String b=a;
		System.out.println("first case");
		System.out.println("==        :"+(a==b));
		System.out.println(".equals()  :"+a.equals(b));
		
		
		System.out.println("Enter two strings ");
		String c=obj.nextLine();
		String d=obj.nextLine();
		System.out.println("Second case");
		System.out.println("==        :"+(c==d));
		System.out.println(".equals()  :"+c.equals(d));
		
		
			
	}
}
