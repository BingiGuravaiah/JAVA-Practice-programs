import java.util.*;
public class Next_Greater_Element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {5,7,1,7,6,0};
        ArrayList<Integer> all = new ArrayList<>();
        
        for (int i = 0; i < arr.length; i++) {
            boolean found = false;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    all.add(arr[j]);
                    found = true;
                    break;
                }
            }
            if (!found) {
                all.add(-1);
            }
        }

        for (int num : all) {
            System.out.print(num + " ");
        }
    }
}
