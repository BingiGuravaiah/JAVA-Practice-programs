import java.util.*;
public class Array_rotation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=3;
        int arr[][]=new int[n][n];
        int arr2[][]=new int[n][n];
        System.out.println("Enter the Array elements: ");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            int x=n-1;
            for(int j=0;j<n;j++){
                arr2[i][j]=arr[x][i];
                x--;
            }
            
        }
        System.out.println("Before Rotation");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Before Rotation");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}
