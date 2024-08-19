
import java.util.*;
public class SumPrime {
    public static void main(String[] args) {
        int arr[]={10,41,18,50,43,31,29,25,59,96,67};
        Arrays.sort(arr);
        int i,j,count,sum=0;
        for(i=arr.length-1;i>=0;i--){
            count=0;
            int x=(arr[i]/2);
            for(j=1;j<=x;j++){
                if(arr[i]%j==0){
                    count++;
                }
            }
            if(count==1){
                arr[i]=0;
                break;
            }
        }    
        for(i=arr.length-1;i>=0;i--){
            count=0;
            int x=(arr[i]/2);
            for(j=1;j<=x;j++){
                if(arr[i]%j==0){
                    count++;
                }
            }
            if(count==1){
                sum+=arr[i];
            }
        }    
          for(int z:arr){
            System.out.print(z+" ");
          }
          System.out.print("\nSum of the prime numbers is: "+sum);
        }
    }
