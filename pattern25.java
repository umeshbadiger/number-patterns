package com.jsp1;

public class pattern25
{
	public static void main(String[] args)
	{
		for(int i=1; i<=5; i++)
		{
			int x=1+i-1;
			for(int j=1; j<=5; j++)
			{
				if(i+j >= 6)
					System.out.print(x--+" ");
				else
					System.out.print("  ");
			}
			x= x+2;
			for(int k=1; k<=5; k++)
			{
				if(k<i)
					System.out.print(x+++" ");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
		for(int i=1; i<=5; i++)
		{
			int x=4+1-i;
			for(int j=1; j<=5; j++)
			{
				if(j>i)
					System.out.print(x--+" ");
				else
					System.out.print("  ");
			}
				x= x+2;
			for(int k=1; k<=5; k++)
			{
				if(k+i < 5)
					System.out.print(x+++" ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
			
	}
		
}