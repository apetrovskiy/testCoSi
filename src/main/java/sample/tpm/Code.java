package sample.tpm;

import java.util.stream.IntStream;

public class Code {
    public static void main(String[] args) {
        System.out.println(addTwoDigits(2356));
    }
    static int addTwoDigits(int n) {
        final int inputValue = n;
        if (Integer.MAX_VALUE < n) {
            return 0;
        }

        return IntStream.range(0, 9)
            /*
            .peek(index -> {
                System.out.println ((int) (inputValue / Math.pow(10.0, index)));
                System.out.println((int) (inputValue / Math.pow(10.0, index + 1)));
                System.out.println(((int) (inputValue / Math.pow(10.0, index + 1))) * 10);
            })
            */
            .map(index -> (int) ((int) (inputValue / Math.pow(10.0, index)) - ((int) (inputValue / Math.pow(10.0, index + 1))) * 10))
            .sum();
    }
}
