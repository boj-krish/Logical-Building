import java.util.*;
import java.util.Arrays;

public class MaxMin{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		for(int i=0;i<=2;i++) {
			System.out.println(a[i]);
			}
		System.out.println(a[n-1]);
		System.out.println(a[n-2]);
		System.out.println(a[n-3]);
				

	
}}