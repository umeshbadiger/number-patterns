package com.jsp1;

public class pattern7 
{
	public static void main(String[] args) 
	{
		int i,j,k='A';
		for( i=1; i<=5; i++)
		{	k=1+i-1;
			for( j=1; j<=5; j++)
			{
			
				if(j<=i)
				{
					System.out.print(k);
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
		
			

