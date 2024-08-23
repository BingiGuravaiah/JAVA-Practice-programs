import java.util.*;
public class Sunny_Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        num=num+1;
        if(Math.sqrt(num)%1==0){
            System.out.println("Sunny Number");
        }else{
            System.out.println("Not Sunny Number");
        }
    }
    
}
