package Practice;

import java.util.Scanner;

public class arraywithscanner {

	public static void main(String[] args) {
int [] ar=new int[3];

	System.out.println("Enter a number");
Scanner sc=new Scanner(System.in);
for(int i=0;i<3;i++)
{
ar[i]=sc.nextInt();
}
for(int i=0;i<3;i++)
{
	System.out.println(ar[i]);
}
	}

}
