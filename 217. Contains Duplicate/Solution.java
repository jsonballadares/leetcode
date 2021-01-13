import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> frequency = new HashMap<Integer, Integer>();
        for (int x : nums) {
            if (frequency.containsKey(x)) {
                frequency.put(x, frequency.get(x) + 1);
            } else {
                frequency.put(x, 1);
            }
        }

        for (int x : nums) {
            if (frequency.get(x) > 1) {
                return true;
            }
        }

        return false;
    }

    public boolean containsDuplicateSet(int[] nums) {
        Set<Integer> hset = new HashSet<>();
        for (int x : nums) {
            if (hset.contains(x)) {
                return true;
            }
            hset.add(x);
        }
        return false;
    }
}