package assignment4;

import java.util.Scanner;

public class Evenno {
	public static void check_even()
	{
		int i,n;
		Scanner s1=new Scanner(System.in);
		n=s1.nextInt();
		for(i=0;i<n;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
check_even();
	}

}
