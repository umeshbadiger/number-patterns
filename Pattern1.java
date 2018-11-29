package com.jsp1;

public class Pattern1 
{
	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
		{
			for(int j=1; j<=5; j++)
			{
			if(i<=j)
				System.out.print(j+" ");
			else
				System.out.print("  ");
			}
			System.out.println();
		}
		
		for(int i=1; i<=5; i++)
		{
			int k= i;
			for(int j=1; j<=5; j++)
			{
				if(j<=i)
					System.out.print(k+++" ");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}
