package Practice;

import java.util.Scanner;

public class arraydivision {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter numbers");
int d=sc.nextInt();
for(int i=1;i<=5;i++)
{
	int div=i/d;
	System.out.println(i+" /"+d+" ="+div);
}
	}

}
