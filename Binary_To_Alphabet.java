import java.util.*;
public class Binary_To_Alphabet{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        int sum=0;
        StringBuilder str=new StringBuilder();
        ArrayList<Integer> all=new ArrayList<>();
        while(num!=0){
            int temp=num%10;
            all.add(temp);
            num=num/10;
        }
        Collections.reverse(all);
        boolean x=true;
        for(int i=0;i<all.size();i++){
            if(all.get(i)!=0){
                sum+=all.get(i);
                if(i==all.size()-1){
                    int m=sum+64;
                    char ch=(char)m;
                    str.append(ch);
                    sum=0;
                }
             }else{
                int m=sum+64;
                char ch=(char)m;
                str.append(ch);
                sum=0;
             }  
        }
        System.out.println(str);
    }
    
}
