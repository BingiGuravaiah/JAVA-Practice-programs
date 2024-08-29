import java.util.*;
public class Print_Alpha_Count {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str=sc.next();
        String temp="";
        ArrayList<Integer> all=new ArrayList<>();
        ArrayList<Character> am=new ArrayList<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(Character.isAlphabetic(ch)){
                am.add(ch);
            }}
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(Character.isDigit(ch)){
                temp+=ch;
            }else{
                if(temp!=""){
                int m=Integer.valueOf(temp);
                all.add(m);
                temp="";
                }


            }
        }
        if(temp!=""){
            int m=Integer.valueOf(temp);
            all.add(m);
        }
        for(int i=0;i<all.size();i++){
            int x=all.get(i);
            for(int j=0;j<x;j++){
                System.out.print(am.get(i));
            }
        }
            
        }
    }
    

