
    
/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
     public static  int gcd (int a , int b){
        if(a==0){
            return b;
        }
        return gcd(b%a,a);
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		   	int na=sc.nextInt();
		    int mo=sc.nextInt();
		    int val=gcd(na,mo);
		    System.out.println(val);
		    
		}
	}
}

