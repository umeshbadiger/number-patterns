package com.jsp1;

public class pattern20 
{
	public static void main(String[] args) {
		for(int i=1; i<=5; i++)
		{
			int k=1;
			for(int j=1; j<=5; j++)
			{
				if(i+j >= 6)
				{
					System.out.print(k+++" ");
				}
				else
					System.out.print("  ");
			}
		//	int m=1+i-2;
			k=k-2;
				for(int l=1; l<=5; l++)
				{
					if(l<i)
						System.out.print(k--+" ");
					else
						System.out.print(" ");
					
				}
			
			System.out.println();
		}
	}

}
