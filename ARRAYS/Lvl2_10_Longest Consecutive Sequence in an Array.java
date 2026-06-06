import java.util.HashSet;

class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        
        int longestStreak = 0;
        for(int x : set) {
            if(!set.contains(x-1)) {
                int cnt = 1;
                int curr = x;
                while(set.contains(curr+1)) {
                    cnt++;
                    curr++;
                }
                longestStreak = Math.max(longestStreak, cnt);
            }
        }

        return longestStreak;
    }
}