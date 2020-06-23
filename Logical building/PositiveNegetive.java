import java.util.*;
public class PositiveNegetive
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a[]=new int[5];
	int count=0;
	int count1=0;
	for(int i=0;i<5;i++)
	{
	    a[i]=sc.nextInt();
	}
		for(int i=0;i<5;i++)
	{
	    if(a[i]>0)
	    {
	        count++;
	    }
	    else{
	        count1++;
	        }
	}
	System.out.println("No of positive integers="+ count);
		System.out.println("No of negetive integers="+ count1);
	
	}
}
