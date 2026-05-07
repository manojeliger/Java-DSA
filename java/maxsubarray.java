public class maxsubarray {
   public static void maxsum(int numbers[]){
    int curr_sum=0;
    int max= Integer.MIN_VALUE;

    for(int i=0;i<numbers.length;i++){
        for(int j=i;j<numbers.length;j++){
            for(int k=i;k<=j;k++){
                curr_sum+=numbers[k];
            }
        System.out.print(curr_sum+" ");

        if (max< curr_sum){
            max=curr_sum;

        }
    }
    }System.out.println();
    
    System.out.print("max sum:"+max);
   } 

   public static void main(String args[]){

    int numbers[]={2,4,5,6,7};
    maxsum(numbers);
   }
}
