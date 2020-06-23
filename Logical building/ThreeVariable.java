public class ThreeVariable
{
	public static void main(String[] args) {
	
		int a=10;
		int temp;
		int b=20;
		int c=30;
		temp=a;
		a=b;
		b=c;
		c=temp;
		System.out.print(a+" "+ b+" "+ c);
	}
}
