import java.util.Scanner;

public class Number_Seris_Print {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int size=sc.nextInt();
        System.out.println("Enter the Array values: ");
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=1;i<=size;i++){
            int key=i;
            int count=0;
            for(int j=0;j<size;j++){
                  if(arr[j]==key){
                    count++;
                  }
            }
            for(int m=0;m<count;m++){
                System.out.print(key+" ");
            }
        }
    }
}
