class Solution {
    
    static int print2largest(int arr[], int n) {
        // code here
        Arrays.sort(arr);
        int max=Integer.MIN_VALUE, max2=Integer.MIN_VALUE; 
        for(int i=0; i<n; i++){
            if(arr[i]>max){
                max2=max;
                max=arr[i];
            }
        }
        if(max2!=Integer.MIN_VALUE)
        return max2;
        else return -1;
        
    }
}