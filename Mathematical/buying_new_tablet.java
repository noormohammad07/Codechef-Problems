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
		    int b=sc.nextInt();
		    int count=0;
		    int maxarea = 0;
		    for(int i=0; i<n; i++){
		        int w=sc.nextInt();
		        int h=sc.nextInt();
		        int bi=sc.nextInt();
		        int area = 0;
		        if(bi<=b){
		          area=w*h;
		            count++;
		        }
		        maxarea = Math.max(area, maxarea);
		    }
		    if(count==0){
		          System.out.println("no tablet");
		    }
		    else {
		        System.out.println(maxarea);
		    }
		    
		}
	}
}
