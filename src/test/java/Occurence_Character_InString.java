import java.util.HashMap;
import java.util.Map;

public class Occurence_Character_InString {
    public static void main(String[] args) {
        String str="Hellowhelowuioop";
        HashMap<Character,Integer> map=new HashMap<>();
        char[] ch=str.toCharArray();
        for (Character c:ch){
            if (map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }
            else {
                map.put(c,1);
            }
        }
        for (Map.Entry<Character,Integer> entry:map.entrySet()){
            System.out.println(entry.getKey()+"::"+entry.getValue());
        }
    }
}
