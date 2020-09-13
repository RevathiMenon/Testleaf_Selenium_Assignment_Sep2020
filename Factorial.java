package week1.day1.assignments;

public class Factorial {
	
	public static void main(String[] args) {
		// Input declared as local variable outside for loop; i=5
//int i=5, fact =1;
//for (int j=1;j<=i;j++)
//{
//	 fact= fact*j;
//	
//}
//System.out.println(fact);
//	}
//
//}

		// Input declared as local variable inside for loop condition; i<=5

int fact =1;
for (int i=1;i<=5;i++)
{
	 fact= fact*i;
	
}
System.out.println(fact);
	}

}