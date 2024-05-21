import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Print_Duplicate_Using_Set {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,2,3,6,7,8,9,1};
        Set<Integer> set=new HashSet<>();
        ArrayList<Integer> list=new ArrayList<>();
        for (int num:arr){

            if (!set.add(num)){
                list.add(num);
            }
        }
        System.out.println(list);
        //System.out.println(set);
    }
}
