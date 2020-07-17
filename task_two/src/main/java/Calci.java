import java.lang.*;
import java.util.Scanner;
abstract class Calculation
{
	abstract void show(int a,int b);
}
class Addition extends Calculation
{
	void show(int a,int b)
	{
		System.out.println("Addition of a and b is="+(a+b));
	}
}
class Subtraction extends Calculation
{
	void show(int a,int b)
	{
		System.out.println("Subtraction of a and b is="+(a-b));
	}
}
class Multiplication extends Calculation{
	void show(int a,int b){
		System.out.println("Multipliaction of a and b is="+(a*b));
	}
}
class Division extends Calculation
{
	void show(int a,int b)
	{
		System.out.println("Division of a and b is="+(a/b));
	}
}
class Calci{
	public static void main(String args[]){
		Calculation c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your choice ");
		System.out.println("1.Addition 2.Subtraction 3.Multiplication 4.Division");
		int m=sc.nextInt();
		System.out.print("a=");
		int a=sc.nextInt();
		System.out.print("b=");
		int b=sc.nextInt();
		if (m==1)
		{
			c=new Addition();
			c.show(a,b);
		}
		else if(m==2)
		{
			c=new Subtraction();
			c.show(a,b);
		}
		else if(m==3)
		{
			c=new Multiplication();
			c.show(a,b);
		}
		else if(m==4)
		{
			c=new Division();
			c.show(a,b);
		}
	}
}