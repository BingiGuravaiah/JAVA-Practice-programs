import java.util.*;
public class Prime_Index_Addition {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,60,70,80,90};
      int sum=0;
        for(int i=2;i<arr.length;i++){
            int count=0;
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count==2){
               sum+=arr[i];
            }
        }
        
        System.out.println(sum);
    }
    
}
