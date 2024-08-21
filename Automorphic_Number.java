import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the number: ");
       int num=sc.nextInt();
       int square=num*num;
       String str=Integer.toString(num);
       int length=str.length();
       switch(length){  
    case 1: int temp=square%10;
    if(num==temp){
        System.out.println("Automorphic Number");
    }else{
         System.out.println("NOT Automorphic Number");
    }
    break;  
    case 2: int a=square%100; 
     if(num==a){
        System.out.println("Automorphic Number");
    }else{
         System.out.println("NOT Automorphic Number");
    }
    break;  
    case 3: int b=square%1000;;  
     if(num==b){
        System.out.println("Automorphic Number");
    }else{
         System.out.println("NOT Automorphic Number");
    }
    break;  

    }  
    }
}
