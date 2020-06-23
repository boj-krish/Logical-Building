import java.util.*;
public class Sum
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a[]=new int[3];
	int sum=0;
	for(int i=0;i<3;i++)
	{
	    a[i]=sc.nextInt();
	}
	for(int i=0;i<3;i++)
	{
	    
	    
	    sum=sum+a[i];
	}
	System.out.print(sum);
}
}
