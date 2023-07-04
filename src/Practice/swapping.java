package Practice;

public class swapping {

	public static void main(String[] args) {
		int a=10,b=20;
		//swap
		int temp;
		temp=a;//a=10
		a=b;//a=20
		b=temp;//
		System.out.println("swap="+a+","+b);
	
	//without temp swapping
	
	int c=5,d=6;
	c=c+d;//11//c=11
	d=c-d;//11-6//d=5
	c=c-d;//11-5=6
	System.out.println("swapping without variable="+c+","+d);
	}
	

}
