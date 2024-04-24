import java.util.*;
public class prefixsum {
 
   
   public static int[] presum(int[] arr) {
        int n = arr.length;
        int[] prefixSum = new int[n];

        prefixSum[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }
        return prefixSum;
    }

    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
            int[] prep=presum(arr);
            for (int i=0;i<prep.length;i++){
                System.out.print(prep[i]+" ");
              }
              System.out.println();
    
        sc.close();
        
    }
}
