import java.util.*;
class Decoding_Message {
    public String decodeMessage(String key, String message) {
        HashMap<Character,Character> all=new HashMap<>();
        int num=97;
        String temp="";
        for(int i=0;i<key.length();i++){
                if(key.charAt(i)!=' '){
                    temp+=key.charAt(i);
                }
        }
        System.out.println(temp);
        LinkedHashSet<Character> k = new LinkedHashSet<>();
        for(int i=0;i<temp.length();i++){
            k.add(temp.charAt(i));
        }
        String my="";
        for(char h:k){
            my+=h;
        }
        for(int i=0;i<my.length();i++){
            char ch=my.charAt(i);
            char x=(char)num;
            all.put(ch,x);
            num++;
            
        
        }
        String ou="";
        for(int i=0;i<message.length();i++){
            char ch=message.charAt(i);
            if(ch!=' '){
                ou+=all.get(ch);
            }else{
                ou+=' ';
            }

        }
       
                  return ou;
    }
    
}
