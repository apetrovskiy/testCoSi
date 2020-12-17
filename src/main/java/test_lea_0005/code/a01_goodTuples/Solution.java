package test_lea_0005.code.a01_goodTuples;

public class Solution {
    public int goodTuples(int[] a) {
        int result = 0;
        if (0 == a.length) {
            return result;
        }
        for (int i = 0; i < a.length - 2; i++) {
            result += compareNumbers(a[i], a[i + 1], a[i + 2]) ? 1 : 0;
        }
        return result;
    }

    private boolean compareNumbers(int n1, int n2, int n3) {
        if (n1 == n2 && n1 != n3 ||
                n1 == n3 && n1 != n2 ||
                n2 == n3 && n2 != n1)
            return true;
        else
            return false;
    }
}
