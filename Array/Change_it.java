public /* package codechef; // don't place package name! */

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
		    int arr[]=new int[n];
		    for(int i=0; i<n; i++){
		        arr[i]=sc.nextInt();
		    }
		    int arr1[]=new int[101];
		    for(int i=0; i<=100; i++){
		        arr1[i]=0;
		    }
		    int ct_max=0;
		    for(int i=0; i<n; i++){
		        arr1[arr[i]]++;
		    }
		    for(int i=0; i<100; i++){
		        if(arr1[i]>ct_max){
		            ct_max=arr1[i];
		        }
		    }
		   
		    System.out.println(n-ct_max);
		   
		}
	}
}
 Change_it {
    
}
