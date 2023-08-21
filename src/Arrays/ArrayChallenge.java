//package Arrays;
//
//import java.util.HashMap;
//import java.util.Map;
//public class ArrayChallenge {
//    public static boolean ArrayChallenge(String[] strArr) {
//        // Create a map to store the parent nodes for each child node.
//        Map<Integer, Integer> parentMap = new HashMap<>();
//        // Iterate over the array of strings and add each pair of integers to the map.
//        for (String str : strArr) {
//            String[] pair = str.substring(1,str.length()-1).split(",");
//            int child = Integer.parseInt(pair[0]);
//            int parent = Integer.parseInt(pair[1]);
//            parentMap.put(child, parent);
//        }
//        // Iterate over the map and check if each child node has a unique parent node.
//        for (Integer child : parentMap.keySet()) {
//            int parent = parentMap.get(child);
//            if (parentMap.containsValue(child)) {
//                return ;
//            }
//        }
//        // If all of the child nodes have unique parent nodes, then a valid binary tree can be formed.
//        return true;
//    }
//    public static void main(String[] args) {
//        // Create an array of strings.
//        String[] strArr = new String[] {"(1,2)", "(2,4)", "(5,7)", "(7,2)", "(9,5)"};
//        // Call the function ArrayChallenge and print the output.
//        boolean result = ArrayChallenge(strArr);
//        System.out.println(result);
//    }
//}
