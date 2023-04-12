class BankAcct
{
	int acc_no;
	double balanace;
	public static double interest=0.15;
	BankAcc
	{}
	BankAcct(int acc_no,double balance)
	{
		this.acc_no=acc_no;
		this.balance=balance;
	}
	void change_interest(double x)
	{
		interest=x;
	}
	void display_interest()
	{
		System.out.println("The interest ="+interest);
	}
	double balance()
	{return balance;}
	double cal_interest()
	{return balnace*interest;}
}
class Q9
{
	public static void main()
	{}
}
