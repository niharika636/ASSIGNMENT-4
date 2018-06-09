package assignment4;

import java.util.Scanner;

public class Amstrongno {
	public static int power(int n, int r) {
	      int c, p = 1;
	 
	      for (c = 1; c <= r; c++) {
	         p = p*n;}
	  
	      return p;   
	   }

	public static void check_amstrong()
	{
		int i,n,num=0,r,count=0;
		Scanner s1=new Scanner(System.in);
		n=s1.nextInt();
		int no=n;
		int a=no;
		while(a > 0)
        {
            a = a / 10;
            count++;
        }
	    while (n != 0)
	    {
	        r = n%10;
	       num += power(r, count);
	        n =n/10;
	    }
		
	    if(num == no)
	    {
				System.out.println(no+" is amstrong no");
			}
	    else
	    	System.out.println(no+" is not amstrong no");
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
check_amstrong();
	}

}
