class Solution {
    public static boolean isMonotonic(int[] A) {
        return isMonotoneIncreasing(A) || isMonotoneDecreasing(A);
    }

    public static boolean isMonotoneIncreasing(int[] A) {
        for (int i = 0; i < A.length - 1; i++) {
            if (!(A[i] <= A[i + 1])) {
                return false;
            }
        }
        return true;
    }

    public static boolean isMonotoneDecreasing(int[] A) {
        for (int i = 0; i < A.length - 1; i++) {
            if (!(A[i] >= A[i + 1])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] input = { 1, 3, 2 };
        System.out.println(isMonotoneIncreasing(input));
    }
}