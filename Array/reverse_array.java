public class reverse_array {
    /******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
    static void swap(int arr[],int i,int j){
         int temp=arr[i];
           arr[i]=arr[j];
           arr[j]=temp;
    }
    static void printarr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]+" ");
        }
    }
    static void rev(int [] arr){
       int i=0;
       int j=arr.length-1;
       while(i<j){
          swap(arr,i,j);
           i++;
           j--;
       }
    }
	public static void main(String[] args) {
		int arr[]={1,2,3,4,5,6};
		rev(arr);
		printarr(arr);
	}
}

    
}
