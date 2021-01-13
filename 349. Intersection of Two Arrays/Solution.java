import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

class Solution {
    /**
     * Brute Force Solution The runtime is O(N^3) at worst case as we would compare
     * every number we are on against every other number we also linear search after
     * Space Complexity would be O(N) for the extra data structure
     */
    public int[] badintersection(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j] && !list.contains(nums1[i])) {
                    list.add(nums1[i]);
                }
            }
        }
        return list.stream().mapToInt(i -> i).toArray();
    }

    /**
     * Optimal Solution The runtime is O(N) for the average case as we build two
     * sets with constant time operations which the building takes O(N) to complete
     * then we iterate over either of the sets and and perform constant time
     * operations.
     * 
     * Space complexity would be O(N) as for the extra data structure
     */
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hset1 = new HashSet<>();
        HashSet<Integer> hset2 = new HashSet<>();
        List<Integer> output = new ArrayList<>();
        for (int x : nums1) {
            hset1.add(x);
        }
        for (int x : nums2) {
            hset2.add(x);
        }
        int currentElement = 0;
        Iterator<Integer> it = hset1.iterator();
        while (it.hasNext()) {
            currentElement = it.next();
            if (hset2.contains(currentElement)) {
                output.add(currentElement);
            }
        }
        return output.stream().mapToInt(i -> i).toArray();
    }
}