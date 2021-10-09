# week1day1
package assignment.week1.day1;

public class Fibonacci {

	public static void main(String[] args) {
		int n = 6;
		int a=1, b=1,c;
		System.out.println(a);
		System.out.println(b);
		for(int i = 3; i<=n; i++)
		{
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
	}

}
