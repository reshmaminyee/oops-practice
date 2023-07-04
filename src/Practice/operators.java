package Practice;

public class operators {

	public static void main(String[] args) {
 // Arithmetic operators
		int a=20;
		int b=10;
System.out.println("a+b="+(a+b));
System.out.println("a-b="+(a-b));
System.out.println("a*b="+(a*b));
System.out.println("a/b="+(a/b));
System.out.println("a%b="+(a%b));
//assignment operator
System.out.println(a=b);//a=10
System.out.println(a+=b);//a+b=20(10+10=20)so a=20
System.out.println(a-=b);//a-b=10(20-10=10)so a=10
System.out.println(a*=b);//a*b=100(10*10=100) so a =100
System.out.println(a/=b);//a/b=10(100/10=10)so a=10
//relational operators
System.out.println(a<b);
System.out.println(a>b);
System.out.println(a==b);
System.out.println(a<=b);
System.out.println(a>=b);
System.out.println(a!=b);
//logical operators
String username="abc";
String password="abc123";
System.out.println(username=="abc" && password=="abc123");
System.out.println(username=="abc" || password=="abc");
//unary operators
int z=10;
System.out.println(z);
System.out.println(++z);
System.out.println(z++);
System.out.println(z);
System.out.println(z--);
System.out.println(z);
//swapping question
int c=1,d=2;
int temp;
temp=c;//c=1
c=d;//c=2
d=temp;
System.out.println("after swapping="+c+","+d);
//swapping 2
int C=10,D=20;
int T;
T=C;//c=10
C=D;//c=20
D=T;
System.out.println("After swapping="+C+","+D);
//swapping without variable
int o=20,p=30;
o=o+p;//20+30=50
p=o-p;//50-30=20
o=o-p;//50-20=30
System.out.println("after swapping without variable="+o+","+p);
//practice question
//write a program if the two number 23 and 45 are equal?
int l=23,m=45;
System.out.println(l==m);
//assign values of variables a and b as 55 and 70 respectively and then check if both the conditions a<50 and a<b are true
int L=55,M=70;
System.out.println(L<50 && L<M);
//int l=23; print 2nd digit
System.out.println(l%20);
//decision making
//if else
int n=10,N=45;
if(n>N)
{
	System.out.println("neutral");
}
else
{
	System.out.println("non-neutral");
}
//example for if and if else
int age=25;
if (age>=18)
{
	System.out.println("you are an adult");
}
if(age>=21)
{
	System.out.println("you are eligible to marry");
}
else
{
	System.out.println("you are not eligible to marry");
}
//else if example
if(age<=21)
{
	System.out.println("you are a minor");
}
else if(age>=45)
{
	System.out.println("you are a senior citizen");
}
else
{
	System.out.println("you are under 25");
}
//nested if
int score=15;
if(score<=50)
{
	if(score<=60)
	{
		System.out.println("you have scored A grade");
	}
	else if (score<=90)
	{
		System.out.println("you are scored as A+ grade");
	}
	else
	{
		System.out.println("you failed the exam");
	}
	//switch case
	int days=2;
	switch(days)
	{
	case 1:System.out.println("Monday");
	break;
	case 2:System.out.println("Tuesday");
	break;
	case 3:System.out.println("Wednesday");
	break;
	case 4:System.out.println("thursday");
	case 5:System.out.println("Friday");
	break;
	default:System.out.println("invalid code");
	}
	//iterative statements
	
	
	

	//factorial
	int Z=5;
	int fac=1;
		for(int i=1;i<=z;i++)
		{
			System.out.println("factorial of 5="+fac);
		}
	}








	}

}
