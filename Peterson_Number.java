import java.util.*;
public class Peterson_Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        int f=num;
        int co=0;
        int sum=0;
        while(num!=0){
            int temp=num%10;
            int x=1;
            num=num/10;
            for(int i=1;i<=temp;i++){
                   x=x*i;
            }
             co+=x;
        }
        if(f==co){
            System.out.println("Peterson Number");
        }else{
            System.out.println("Not Peterson Number");
        }
    }
    
}
