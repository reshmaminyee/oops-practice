package Practice;

public class questions {

	public static void main(String[] args) {
		//write a program to check if the two numbers 23 and 45 are equal
		int a=23,b=45;
		System.out.println(a==b);//false
		//assign values of variables a and b as 55 and 70 respectively and then check if both the conditions a<50 and A<b are true
		int c=55,d=70;
		System.out.println(c<50 && c<b);//false
		//i/p int a=20,b=30;
		//swap without a variable
		//o/p b=20,a=30
		int e=20,f=30;
		e=e+f;//20+30=50//e=50
		f=e-f;//50-30//f=20
		e=e-f;//50-20=30
		System.out.println("Swapping without a variable="+e+","+f);
		//print a=17
		//print second digit
		int g=17;
		g=17-10;
		System.out.println(g);
		int h=17;
		int i=h%10;
		System.out.println(i);
		

	}

}
