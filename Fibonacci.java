package week1.day1.assignments;

public class Fibonacci {

	public static void main(String[] args) {
		
int range =8,num1=0, num2=1;
System.out.print("Fibonacci series of "+range+" is: ");
for (int i=1; i<=range;i++)
{
	System.out.print( num1+" ");
	int sum = num1 + num2;
	num1=num2;
	num2=sum;
}
	}

}
