package test_lea_0005.code.a03_bouncingDiagonals;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    public int[] bouncingDiagonals(int[][] matrix) {
        int[] leftmost = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            leftmost[i] = matrix[i][0];
        }
        int[][] resultArray = new int[leftmost.length][2];
        for (int i = 0; i < leftmost.length; i++) {
            resultArray[i][1] = leftmost[i];
            resultArray[i][0] = getAscendingDiagonalSum(matrix, i) + getDescendingDiagonalSum(matrix, i);
        }
        int[] elements = new int[leftmost.length];

//        System.out.println("before sorting");
//        Arrays.stream(resultArray)
//                .forEach(item -> System.out.println(item[0] + " " + item[1]));

        Arrays.sort(resultArray, Comparator.comparingInt(elt -> elt[0]));

//        System.out.println("after sorting");
//        Arrays.stream(resultArray)
//                .forEach(item -> System.out.println(item[0] + " " + item[1]));

        for (int i = 0; i < leftmost.length; i++) {
            elements[i] = resultArray[i][1];
        }
        return elements;
    }

    private int getAscendingDiagonalSum(int[][] matrix, int elementStartIndex) {
        int result = 0;
        if (0 == elementStartIndex) {
//            System.out.println("ascending = " + result);
            return result;
        }
        for (int hor = 0, vert = elementStartIndex; hor <= elementStartIndex; hor++, vert--) {
            result += matrix[hor][vert];
        }
//        System.out.println("ascending = " + result);
        return result;
    }


    private int getDescendingDiagonalSum(int[][] matrix, int elementStartIndex) {
        int result = 0;
        if (matrix.length - 1 == elementStartIndex) {
//            System.out.println("descending = " + result);
            return result;
        }
        for (int vert = elementStartIndex, hor = 0; vert < matrix.length; vert++, hor++) {
            if (0 != elementStartIndex && 0 == hor) {
//                System.out.println("vert = " + vert + " hor = " + hor + " value' = " + matrix[hor][vert]);
                continue;
            }
//            System.out.println("vert = " + vert + " hor = " + hor + " value = " + matrix[hor][vert]);
            result += matrix[hor][vert];
        }
//        System.out.println("descending = " + result);
        return result;
    }
}
