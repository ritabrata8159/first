
import java.util.Scanner;
class circle
{
	final public static double pi=3.14;
	double radius;
	double area(double r)
	{
		radius=r;
		return (pi*r*r);
	}
}
class Q2
{
	
	public static void main(String args[])
	{
		System.out.println("Enter the radius");
		Scanner obj=new Scanner(System.in);
		double r=obj.nextDouble();
		circle c=new circle();
		System.out.println("Area= "+c.area(r));
	}
}
