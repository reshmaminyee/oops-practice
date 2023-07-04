package Practice;

public class palindrome {

	public static void main(String[] args) {
		int a=345;
		int r,s=0;
		while (a>0)
		{
			r=a%10;//r=5
			s=(s*10)+r;//s=5
			a=a/10;//34
				
System.out.println(s);
	}

}
}
