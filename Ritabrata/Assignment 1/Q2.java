import java.util.Scanner;
class Q3
{
	public static void main(String args[])
	{
		int count =args.length;
		if(count>0)
		{
			
			System.out.println("no of command line arguments ="+count);
			System.out.println("Command line arguments are=");
			for(int i=0;i<count;i++)
			{
				System.out.println(args[i]);
			}
		}
		else
		{
			System.out.println("No arguments");
		}
	}
}
