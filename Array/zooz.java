/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int n=sc.nextInt();
		    int []arr=new int[n];
		    if(n%2==0){
		            arr[0]=1;
		            arr[n-1]=1;
		        }else{
		            arr[0]=0;
		            arr[n-1]=0; 
		        }
		    for(int i=1; i<n-1; i++){
		       if(n%2==0){
		           arr[i]=0;
		       }else{
		           arr[i]=1;
		       }
		    }
		    for(int i=0; i<n; i++){
		        System.out.print(arr[i]);
		    }
		     System.out.println();
		}
	}
}
