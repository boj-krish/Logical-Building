package boj;
import java.util.*;
public class Marks{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count0=0;
		int count1=0;
		int count2=0;
		
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			if(a[i]==0)
			{
				count0++;
			}
			else if(a[i]==1)
			{
				count1++;
			}
			else if(a[i]==100)
			{
				count2++;
			}
			else
			{
				
			}
			
		}
		System.out.println("No of students scorced Zero: "+count0);
		System.out.println("No of students scorced one: "+count1);
		System.out.println("No of students scorced Hundred: "+count2);
}}
