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
		    int n=sc.nextInt();
		    int[]arr1=new int[n];
		    int[]arr2=new int[n];
		    
		    for(int i=0; i<n; i++){
		        arr1[i]=sc.nextInt();
		    }
		    
		     for(int i=0; i<n; i++){
		        arr2[i]=sc.nextInt();
		    }
		    int max_like=0;
		    int max_comment=0;
		    int index=0;
		    for(int i=0; i<n; i++){
		        if(arr1[i]>max_like || arr1[i]==max_like && arr2[i]>max_comment){
		            max_like=arr1[i];
		            max_comment=arr2[i];
		            index=i;
		        }
		       // System.out.println(index+1);
		    }
		     System.out.println(index+1);
		 
	}
  }
}
