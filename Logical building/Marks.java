import java.util.*;
public class Marks
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a[]=new int[3];
	int count=0;
	for(int i=0;i<3;i++)
	{
	    a[i]=sc.nextInt();
	}
		for(int i=0;i<3;i++)
	{
	    if(a[i]>=35)
	    {
	        count++;
	    }
	}
	System.out.println(count);
	
	}
}
