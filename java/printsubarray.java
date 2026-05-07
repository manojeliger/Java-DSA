public class printsubarray {
   public static void subarray(int arr[]){

    int n=arr.length-1;
    for(int i=0;i<n;i++){
        for(int j=i;j<n ; j++){
            for(int k=i ; k<=j;k++){
                System.out.print(arr[k]+" ");
            } 
            
           System.out.print(" , "); 
        }
    }
   } 


public void main(String args[]){

    int arr[]={2,3,4,5,6};

    subarray(arr);
}
}

