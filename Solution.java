import java.util.*;
class Solution {
    public int majorityElement(int[] nums) {
      HashMap<Integer,Integer> all=new HashMap<>();
      for(int i=0;i<nums.length;i++){
        int temp=nums[i];
        if(all.containsKey(temp)){
            int x=all.get(temp);
            all.put(temp,x+1);
        }else{
            all.put(temp,1);
        }
      }
      int max_val=0;
      for(int x:all.keySet()){
             max_val=Math.max(max_val,all.get(x));
      }
      int m=0;
      for(int x:all.keySet()){
             if(max_val==all.get(x)){
                m=x;
                break;
             }
      }
        return m;
    }  
    
    
}
