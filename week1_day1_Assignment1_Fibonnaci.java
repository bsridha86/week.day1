package seleniumJavaWeek1.day1;

public class week1_day1_Assignment1_Fibonnaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=9;
		long a=0;
		long b=1;
		long output=0;
		System.out.println(a);
		System.out.println(b);
		for(int i=0;i<x;i++)
		{
		output=a+b;
		System.out.println(output);
		a=b;
		b=output;
		}
	}
}
