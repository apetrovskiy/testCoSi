package test_lea_0005.code.a02_equallyRearranging;

public class Solution {
    public String equallyRearranging(String str) {
        String result = "";
        final String W = "W", D = "D", L = "L", EMPTY = "";
        if (1 == str.length())
            return str;

        while (str.length() > 0) {
            if (str.contains(W)) {
                result += W;
                str = str.replaceFirst(W, EMPTY);
            }
            if (str.contains(D)) {
                result += D;
                str = str.replaceFirst(D, EMPTY);
            }
            if (str.contains(L)) {
                result += L;
                str = str.replaceFirst(L, EMPTY);
            }
        }

        return result;
    }
}
