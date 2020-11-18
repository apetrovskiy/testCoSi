package test_lea_0003.a01_evenDigitsNumber;

import java.util.stream.IntStream;

public class EvenDigitsNumber {
    public int evenDigitsNumber(int[] a) {
        return processArrayElements(a);
    }
    
    private int processArrayElements(int[] inputArray) {
        return IntStream.range(0, inputArray.length)
            .map(index -> isEven(inputArray[index]))
            .sum();
    }
    
    private int isEven(int element) {
        if (element < 10 || (element >= 100 && element < 1000)) {
            return 0;
        }
        if (element < 100 || (element >= 1000 && element < 10000)) {
            return 1;
        }
        return 0;
    }
}
