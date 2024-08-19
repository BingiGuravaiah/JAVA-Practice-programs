import java.util.*;
public class Roman_To_Integer {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str=sc.next();
        int result=0;
        HashMap<Character,Integer> map=new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        for(int i=str.length()-2;i>=0;i--){
            if(map.get(str.charAt(i))<map.get(str.charAt(i+1))){
                result-=map.get(str.charAt(i));
            }else{
                result+=map.get(str.charAt(i));
            }
        }
        System.out.println(result);
    }
    
}
