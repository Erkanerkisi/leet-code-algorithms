import java.util.ArrayList;
import java.util.List;

class Solution {
    public static void main(String[] args) {
        int[] arr = new int[]{2,3,6,7};
        System.out.println(combinationSum(arr, 7));
    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        rec(candidates, target, list, new ArrayList<>(), 0);
        return list;
    }

    public static void rec(int[] candidates, int target, List<List<Integer>> list, List<Integer> subList, int x) {
        if (target == 0) {
            list.add(new ArrayList<>(subList));
        } else if (target > 0) {
            for (int i = x; i < candidates.length; i++) {
                subList.add(candidates[i]);
                rec(candidates, target - candidates[i], list, subList, i);
                subList.remove(subList.size() - 1);
            }
        }
    }
}