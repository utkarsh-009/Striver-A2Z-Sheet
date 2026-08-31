class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        Set<Character> seen = new HashSet<>();
        int maxLen = 0, i = 0;
        for(int j = 0; j < n; j++) {
            if(seen.contains(s.charAt(j))) {
                while(s.charAt(i) != s.charAt(j)) {
                    seen.remove(s.charAt(i));
                    i++;
                }
                i++;
            }
            seen.add(s.charAt(j));
            maxLen = Math.max(maxLen, j - i + 1);
        }

        return maxLen;
    }
}