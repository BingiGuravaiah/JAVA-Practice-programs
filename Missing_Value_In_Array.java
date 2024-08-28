import java.util.*;
class Missing_Value_In_Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={1,3,4,5,8,10};
        for(int i=1;i<=10;i++){ 
            int count=0;
                for(int j=0;j<arr.length;j++){
                    if(arr[j]==i){
                        count++;
                    }
                }
                if(count==0){
                    System.out.println(i);
                }
                
           }
     }
}
