package seleniumJavaWeek1.day1;

public class week1_day1_Assignment2_Primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a =99;
int count = 1;
for(int i=2;i<a;i++)
{
	if (a%i==0)
{
	count++;
}

}
if (count ==1)
{
	System.out.println("The given no. " + a +" is a PRIME number");
}
else
{
	System.out.println("The given no. " + a +" is a NOT a PRIME number");
}
	}
}
