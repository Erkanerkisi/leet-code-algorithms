import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int singleNumber(int[] nums) {

        Map<Integer,Integer> map = new HashMap<>();
        int result=0;

        for(int i =0; i< nums.length ; i++) {
            if(!map.containsKey(nums[i])) {
                map.put(nums[i],i);
            }
            else {
                map.remove(nums[i]);
            }

        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            result = entry.getKey();
        }

        return result;

    }
}