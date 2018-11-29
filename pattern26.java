package com.jsp1;

public class pattern26 {
	public static void main(String[] args) {
	for(int i=1; i<=5; i++)
	{
		int x='A'+i-1;
		for(int j=1; j<=5; j++)
		{
			if(j+i>=6)
				System.out.print((char)x--+" ");
			else
				System.out.print("  ");
		}
		x=x+2;
		for(int k=1; k<=5; k++)
		{
			if(k<i)
				System.out.print((char)x+++" ");
			else
				System.out.print("  ");
		}
		System.out.println();
	}
	
  }	
}
