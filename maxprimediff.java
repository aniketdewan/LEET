import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class maxprimediff {

    public static void main(String[] args) {
        int[] nums = {4, 6, 7, 9, 11, 13, 16};

        Solution solution = new Solution();
        int maxPrimeDifference = solution.maximumPrimeDifference(nums);
        System.out.println("Maximum prime difference: " + maxPrimeDifference);
    }

    static class Solution {
        public int maximumPrimeDifference(int[] nums) {
            List<Integer> primeIndices = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                if (isPrime(nums[i])) {
                    primeIndices.add(i);
                }
            }

            if (primeIndices.isEmpty()) {
                return -1; 
            }

            int min = Collections.min(primeIndices);
            int max = Collections.max(primeIndices);

            return max - min;
        }

        boolean isPrime(int num) {
            if (num == 1) return false;
            if (num == 2) return true;
            if (num % 2 == 0) return false;

            for (int i = 3; i * i <= num; i++) {
                if (num % i == 0) return false;
            }
            return true;
        }
    }
}