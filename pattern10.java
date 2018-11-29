package com.jsp1;

public class pattern10
{ 
	public static void main(String[] args) {
	
	for(int i=1;i<=5;i++)
	{char n='A';
		for(int j=1; j<=5;j++)
		{
			if(j<=6-i)
				System.out.print(n++);
			System.out.print(" ");
		}
		System.out.println();
	}
	
	pattern11 p11 =new pattern11();
	p11.pat1();

}
}
	
class pattern11
{
	void pat1()
	{
		
		for(char i='A';i<='E';i++)
		{
			for(char j='A'; j<='E';j++)
			{
				if(j<i)
					System.out.print(" ");
				else
					System.out.print(j);
			}
			System.out.println();
		}
		this.pat2();

	}
	
	void pat2()
	{
		
		for(int i=1;i<=5;i++)
		{char n= ('A');
			for(int j=1; j<=5;j++)
			{
				if(j<i)
					System.out.print(" ");
				else
					System.out.print(n++);
			}
			System.out.println();
		}
		
		

	}
}
