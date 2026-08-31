class Solution {
    public int totalFruit(int[] fruits) {
        int n = fruits.length;
        Map<Integer, Integer> types = new HashMap<>();
        int maxFruits = 0, i = 0;
        for(int j = 0; j < n; j++) {
            int type = fruits[j];
            if(types.size() == 2 && !types.containsKey(type)) {
                while(types.size() == 2) {
                    types.put(fruits[i], types.get(fruits[i]) - 1);
                    if(types.get(fruits[i]) == 0) types.remove(fruits[i]);
                    i++;
                }
            } 
            types.put(type, types.getOrDefault(type, 0) + 1);
            maxFruits = Math.max(maxFruits, j - i + 1);
        }

        return maxFruits;
    }
}