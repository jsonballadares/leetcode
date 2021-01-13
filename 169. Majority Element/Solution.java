class Solution {
    public int majorityElement(int[] nums) {
        int majorityThreshold = nums.length / 2;
        HashMap<Integer, Integer> hmap = new HashMap<>();
        for (int x : nums) {
            if (hmap.containsKey(x)) {
                hmap.put(x, hmap.get(x) + 1);
            } else {
                hmap.put(x, 1);
            }
        }
        Iterator iterator = hmap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry pair = (Map.Entry) iterator.next();
            if (Integer.parseInt(pair.getValue().toString()) > majorityThreshold) {
                return Integer.parseInt(pair.getKey().toString());
            }
        }
        return -1;
    }
    // TODO REVISIT OTHER MORE OPTIMAL SOLUTIONS
}