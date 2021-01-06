import java.util.Arrays;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

    }

    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 3, 0, 0, 0 };
        int m = 3;

        int[] nums2 = { 2, 5, 6 };
        int n = 3;

        int indexOne = m - 1;
        int indexTwo = n - 1;
        int indexToInsert = nums1.length - 1;

        while (indexOne >= 0 && indexTwo >= 0) {
            if (nums1[indexOne] > nums2[indexTwo]) {
                nums1[indexToInsert--] = nums1[indexOne--];
            } else {
                nums1[indexToInsert--] = nums2[indexTwo--];
            }
        }
        System.out.println(Arrays.toString(nums1));
    }
}