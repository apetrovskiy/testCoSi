package test_lea_0003.a02_divisorSubstrings;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public int divisorSubstrings(int n, int k) {
        return sumOfDivisors(n, k);
    }
    
    private int sumOfDivisors(int inputData, int groupLength) {
        int result = 0;
        if (0 == inputData) {
            return result;
        }
        List<Integer> divisors = getDivisorsToTry(inputData, groupLength);
        return divisors.stream().collect(Collectors.toSet()).size();
    }
    
    private List<Integer> getDivisorsToTry(int inputData, int groupLength) {
        final String inputString = String.valueOf(inputData);
        List<Integer> resultList = new ArrayList<>();
        for (int i = 0; i <= inputString.length() - groupLength; i++) {
            final String group = inputString.substring(i, i + groupLength);
            final int potentialDivisor = Integer.parseInt(group);
            if (0 == inputData % potentialDivisor)
                resultList.add(potentialDivisor);
        }
        return resultList;
    }
}
