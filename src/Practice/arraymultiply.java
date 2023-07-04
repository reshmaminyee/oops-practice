package Practice;

import java.util.Scanner;

public class arraymultiply {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter numbers");
int m=sc.nextInt();
for(int i=1;i<=10;i++)
{
	int mul=i*m;
	System.out.println(i+" *"+m+" ="+mul);
}


	}

}
