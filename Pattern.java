import java.util.*;
public class Example {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of values: ");
        int num=sc.nextInt();
        ArrayList<Integer> all=new ArrayList<>();
        for(int i=1;i<=num;i++){
            all.add(i);
        }
        while (all.size()!=1) {
            for(int i=0;i<all.size();i++){
                if(all.get(i)%2!=0){
                    all.remove(all.get(i));
                   
                }
            }
            if(all.size()!=2){
            for(int i=all.size()-1;i>=0;i--){
                    all.remove(all.get(i));
                    i--;
                    
            }
            }else{
                      System.out.println("The end answer is: "+all.get(1));
                      return;
        }
           
        }
       
    }
    
}
