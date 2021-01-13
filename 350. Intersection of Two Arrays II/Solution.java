import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class Solution {

    /**
     * Optimal Solution O(N) Space Complexity O(N) Time Complexity
     */
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> hmap = new HashMap<>();
        ArrayList<Integer> intersection = new ArrayList<>();

        for (int x : nums1) {
            if (hmap.containsKey(x)) {
                hmap.put(x, hmap.get(x) + 1);
            } else {
                hmap.put(x, 1);
            }
        }

        for (int x : nums2) {
            if (hmap.get(x) != null && hmap.get(x) > 0) {
                intersection.add(x);
                hmap.put(x, hmap.get(x) - 1);
            }
        }

        int[] output = new int[intersection.size()];
        for (int i = 0; i < intersection.size(); i++) {
            output[i] = intersection.get(i);
        }
        return output;
    }

    // Two Pointer and Sorted
    public int[] intersect2(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> intersection = new ArrayList<>();

        int i = 0;
        int j = 0;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                intersection.add(nums1[i]);
                i++;
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }
        return convertListToArray(intersection);
    }

    public int[] convertListToArray(List<Integer> list) {
        int[] output = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            output[i] = list.get(i);
        }
        return output;
    }
}