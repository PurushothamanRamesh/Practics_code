package Map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class SortaValue {
    public static void main(String[] args) {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(1,5);
        map.put(2,4);
        map.put(3,3);
        map.put(4,2);
        map.put(5,1);
        int[][] value=new int[map.size()][2];
       // List<List<Integer>> arr=new ArrayList<>();
        int indexofone=0;
        for (int i: map.keySet()){
            if(indexofone==map.size()) break;
            value[indexofone][0]=i;
            value[indexofone][1]=map.get(i);
            indexofone++;
        }
        Arrays.sort(value,(a,b)->b[0]-a[0]);
        for (int[] i:value) {
            System.out.println(i[0]+" value is "+i[1]);
        }
    }
}
