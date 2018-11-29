package com.jsp1;

public class pattern14 
{
	public static void main(String[] args) {
		for(int i=1; i<=5; i++)
		{
			int k=1;
			for(int j=1; j<=5; j++)
			{
				if(i+j >= 6)
					System.out.print(k++);
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
		for(int i=1; i<=5; i++)
		{
			char k ='A';
			for(int j=1; j<=5; j++)
			{
				if(i+j >= 6)
					System.out.print(k++);
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}
