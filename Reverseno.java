package assignment4;

import java.util.Scanner;

public class Reverseno {
	public static void reverse()
	{
		int n,no=0,r;
		Scanner s1=new Scanner(System.in);
		n=s1.nextInt();
		while(n!=0)
		{
			r = n%10;
	        no = no*10 + r;
			n=n/10;}
			System.out.println("Reverse No:"+ no);
		}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     reverse();
	}
}
