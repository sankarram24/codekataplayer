/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class uniqeelement
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s=new Scanner(System.in);
		int count;
		int n=s.nextInt();
		int[] ar=new int[n];
		for(int i=0;i<n;i++)
		{
			ar[i]=s.nextInt();
		}
			
			for(int i=0;i<n;i++)
			{
				count=0;
				for(int j=0;j<n;j++)
				{
					if(ar[i]==ar[j])
					{
						count++;
					}
				}
				if(count==1)
				{
					System.out.println(ar[i]);
				}
			}
			
	}
}
