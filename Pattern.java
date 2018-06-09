package assignment4;

public class Pattern {
	public static void patternprint()
	{
		int i,j;
		for(i=0;i<=4;i++)
		{
			for(j=0;j<=4-i;j++)
			{
				
				System.out.print("*");
			}
				
		System.out.print("\n");
			}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
patternprint();
	}

}
