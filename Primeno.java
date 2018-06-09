package assignment4;

import java.util.Scanner;

public class Primeno {

	public static void check_prime() {
		// TODO Auto-generated method stub
		{
			int i,n,c=0,j;
			Scanner s1=new Scanner(System.in);
			n=s1.nextInt();
			for(i=2;i<n;i++)
			{
				c=0;
				for(j=2;j<i;j++)
				{
					if(i%j==0)
					{
						c++;
					}
				}
				if(c==0)
				{
					System.out.println(i);
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
check_prime();
	}

}
