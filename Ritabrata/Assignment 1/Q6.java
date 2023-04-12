import java.util.Scanner;
class myclass
{
	void show(int a)
	{
		System.out.println(a);
	}
	/*void show(double a)
	{
		System.out.println(a);
	}*/
}
class Q6
{
	
	public static void main(String args[])
	{
		myclass m=new myclass();
		short s=5;
		double d=1.5;
		
		m.show(s);
		m.show(d);
	}
}
