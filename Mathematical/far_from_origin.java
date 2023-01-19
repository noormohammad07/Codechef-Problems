/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int x1=sc.nextInt();
		    int y1=sc.nextInt();
		    int x2=sc.nextInt();
		    int y2=sc.nextInt();
		    int a=(x1*x1)+(y1*y1);
		     int b=(x2*x2)+(y2*y2);
		     if(a>b){
		         System.out.println("ALEX");
		     }else if(b>a){
		          System.out.println("BOB");
		     }else{
		          System.out.println("EQUAL");
		     }
		}
	}
}
