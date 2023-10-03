package sliding_window;

import java.util.ArrayList;
import java.util.List;

public class Permutation {
    public static void main(String[] args) {
        int[]  arr={1,2,3};
        List<List<Integer>> lists = findpermutation(arr);
        for (List<Integer> ls : lists){
           for (Integer anse:ls){
               System.out.print(anse+" ");
           }
            System.out.print(" ,");
        }

    }

    private static List<List<Integer>> findpermutation(int[] arr) {
        List<List<Integer>> result =new ArrayList<>();
        dfs(result,new ArrayList<Integer>(),arr);
        return result;

    }

    private static void dfs(List<List<Integer>> result, ArrayList<Integer> templist, int[] arr) {
        if (templist.size()== arr.length){
            result.add(new ArrayList<>(templist));
            return ;
        }
        for (int num:arr) {
            if(templist.contains(num))
                continue;
            // first add the element
            templist.add(num);
            // check again
            dfs(result, templist, arr);
            // remove the current
            templist.remove(templist.size()-1);

        }
    }
}
