import java.util.HashMap;
import java.util.Map;

class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> subArrSumsMap = new HashMap<>();
        int sum = 0;
        int count = 0;
        for(int x : nums) {
            sum += x;
            
            if(sum == k) count++;
            if(subArrSumsMap.containsKey(sum - k)) count += subArrSumsMap.get(sum - k);

            subArrSumsMap.put(sum, subArrSumsMap.getOrDefault(sum, 0) + 1);
        }

        return count;
    }
}