package training.core.LargestNumber;

class Solution {
    int largestNumber(int n) {
        int result = 9;
        int i = 1;
        while (i < n) {
            result += 9 * Math.pow(10.0, i);
            i++;
        }
        return result;
    }
}
