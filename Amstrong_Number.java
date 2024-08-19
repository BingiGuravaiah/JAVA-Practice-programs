import java.util.*;
public class Amstrong_Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        int x=num;
        String str=Integer.toString(num);
        int length=str.length();
        int sum=0;
        while(num!=0){
            int temp=num%10;
            sum+=Math.pow(temp,length);
            num=num/10;
        }
        if(x==sum)
        System.out.println(x+" is an amstrong number");
        else
        System.out.println(x+" is not an amstrong number");

    }
    
}
