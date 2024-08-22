import java.util.*;
public class SecondLargest_Number {
    public static void main(String[] args) {
        int arr[]={10,20,30,80,80,45,64};
        TreeSet<Integer> all=new TreeSet<>();
        for(int i=0;i<arr.length;i++){
            all.add(arr[i]);
        }
        ArrayList<Integer> am=new ArrayList<>(all);
        System.out.println(am.get(am.size()-2));

    }
    
}
