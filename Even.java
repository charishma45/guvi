/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Even
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		if(a%2==0){
			System.out.println("Even");
		}else if(a%2!=0)
		{
			System.out.println("Odd");
		}else
		{
			System.out.println("invalid");
		}
}
}
		
