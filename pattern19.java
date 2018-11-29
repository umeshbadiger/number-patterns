package com.jsp1;

public class pattern19 {
	public static void main(String[] args) {
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=5; j++)
			{
				if(i==1 || j==1 || i==5)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
			
		}
		for(int i=1; i<=5; i++)
		{
			for(int k=1; k<=5; k++)
			{
				if(k==5 || i==5)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
			
		}
		
	}
}
