import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> counterSet = new HashSet<>();

        counterSet.add(n);
        n = sumOfSquareDigits(n);
        while (!counterSet.contains(n)) {
            counterSet.add(n);
            n = sumOfSquareDigits(n);
        }

        return n == 1;
    }

    public int sumOfSquareDigits(int n) {
        int sum = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        while (n > 0) {
            arr.add(n % 10);
            n = n / 10;
        }
        for (int x : arr) {
            sum += x * x;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().isHappy(19));
    }
}