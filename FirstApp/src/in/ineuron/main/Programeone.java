package in.ineuron.main;

 public class Programeone {

	public static void main(String[] args) {
		
		int n=11;
		
		for (int i=0;i<n;i++)
		{
			// To print I
			for(int j=0; j<n;j++)
			{
				if(i==0 || j==(n-1)/2 || i==n-1) {
				System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			//To print N
			for(int j=0;j<n;j++)
			{
				if(j==0 || j==n-1 || i==j)
				{
				System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			//To print E
			for (int j=0; j<n;j++)
			{
				if(i==0 || j==0 || i==n-1 || i==(n-1)/2)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			// To print U
			for (int j=0;j<n;j++)
			{
				if((j==0 && i!=n-1) || (j==n-1 && i!=n-1)|| (j>0 && i==n-1 && j!=n-1) )
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			//To print R
			for(int j=0;j<n;j++)
			{
				if(j==0 || i==j || (j==n-1 && i<=(n-1)/2 && i!=0 ) || (i==0 && j!=n-1))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			//To print O
			for(int j=0; j<n;j++)
			{
				if((i==0 && j!=0 && j!=n-1) || (j==0 && i!=0 && i!=n-1) || (i==n-1 && j!=0 && j!=n-1) || (j==n-1 && i!=n-1 && i!=0))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			//To print N
			for(int j=0;j<n;j++)
			{
				if(j==0 || j==n-1 || i==j)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
		
			System.out.println();
		}
}}
