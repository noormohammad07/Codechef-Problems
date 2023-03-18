public class binary_string {
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
		    int x=sc.nextInt();
		    int y=sc.nextInt();
		    String s=sc.next();
		    
		    int zero=0;
		    int one=0;
		    
		    for(int i=0;i<n; i++){
		        if(s.charAt(i)=='0'){
		            zero++;
		        }else{
		            one++;
		        }
		    }
		    
		    if(zero==0||one==0){
		        System.out.println("0");
		        continue;
		    }
		    if(x>y){
		         System.out.println(y);
		    }else{
		         System.out.println(x);
		    }
	}
}
}

    
}
