import java.util.*;
public class Validation_of_Password{
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the string: ");
String str=sc.nextLine();
int x=0,m=0,l=0;
if(str.length()>=4 && ! (str.charAt(0)>='0' && str.charAt(0)<='9')){
for(int i=0;i<str.length();i++){
     if(str.charAt(i)>='0' && str.charAt(i)<='9'){
            x=1;
     }
     if(str.charAt(i)>='A' && str.charAt(i)<='Z'){
            m=1;
     }
     if(str.charAt(i)==' ' || str.charAt(i)=='/') {
            l=0;
      }
}
if(x==1 && m==1 && 1!=1){
    System.out.println(1);
}else{
    System.out.println(0);
}
}else{
    System.out.println(0);
     }
}
}
