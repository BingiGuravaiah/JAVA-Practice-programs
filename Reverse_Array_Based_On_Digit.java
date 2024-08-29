import java.util.*;
public class Reverse_Array_Based_On_Digit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int size=sc.nextInt();
        System.out.println("Enter the Array values: ");
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the reverse position digit: ");
        int num=sc.nextInt();
        ArrayList<Integer> all=new ArrayList<>();
        for(int i=0;i<size;i++){
            int x=arr[i];
            all.add(x);
        }
        for(int i=0;i<num;i++){
            int temp=all.get(0);
            all.add(temp);
            all.remove(all.get(0));
           
        }
        for(int x:all){
        System.out.print(x+" "); 
        }
   }
}
