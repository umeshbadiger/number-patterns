package com.jsp1;

public class pattern17
{
	public static void main(String[] args) {
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=10; j++)
			{
				System.out.print("*"+" ");
			}
			for(int k=1; k<=5;k++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
			
			
		}
		
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=5; j++)
			{
				System.out.print(j+" ");
			}
			for(int k=5; k>=1; k--)
			{
				System.out.print(k+" ");
			}
			System.out.println();
		}
	}

}
