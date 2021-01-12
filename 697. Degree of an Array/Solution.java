import java.util.Arrays;
import java.util.HashMap;

public class Solution {
    public int findShortestSubArray(int[] nums) {
        int maxCount = 0;
        HashMap<Integer, Integer> numCounts = new HashMap();

        int minimum = 0;

        for (int x : nums) {
            numCounts.put(x, numCounts.getOrDefault(x, 0) + 1);
            if (numCounts.get(x) > maxCount) {
                maxCount = numCounts.get(x);
            }
        }

        return minimum;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 2, 3, 1 };
        System.out.println(new Solution().findShortestSubArray(nums));
    }
}
