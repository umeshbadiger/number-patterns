package com.jsp1;

public class pattern9 {
	public static void main(String[] args) {
		int i,j;
		for(i=1;i<=5;i++)
		{
			char k='A';
			for(j=1;j<=5;j++)
			{
				
				if(i<=j)
				{
					System.out.print(k+++" ");
			
				}
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}
