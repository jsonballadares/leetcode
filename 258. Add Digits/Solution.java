import java.util.ArrayList;

class Solution {

    public int addDigits(int num) {
        if (num == 0) {
            return 0;
        }

        if (num % 9 == 0) {
            return 9;
        }

        return num % 9;
    }

    public int addDigitsBad(int num) {
        while (num > 9) {
            num = sumOfSquareDigits(num);
        }
        return num;
    }

    public int sumOfSquareDigits(int n) {
        int sum = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        while (n > 0) {
            arr.add(n % 10);
            n = n / 10;
        }
        System.out.println(arr.toString());
        for (int x : arr) {
            sum += x;
        }
        return sum;
    }
}