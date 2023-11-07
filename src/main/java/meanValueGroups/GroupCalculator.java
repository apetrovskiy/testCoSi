package meanValueGroups;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@SuppressWarnings("PMD")
public class GroupCalculator {
    int[][] calculate(int[][] a) {
        final Map<Integer, Double> result =
                //        return
                IntStream.range(0, a.length)
                        .boxed()
                        .collect(
                                Collectors.groupingBy(
                                        Function.identity(),
                                        Collectors.summingDouble(
                                                index ->
                                                        new Double(Arrays.stream(a[index]).sum())
                                                                / new Double(a[index].length))))
                        .entrySet()
                        .stream()
                        .peek(
                                entry ->
                                        System.out.println(
                                                "key = "
                                                        + entry.getKey()
                                                        + ", value = "
                                                        + entry.getValue()))
                        .collect(Collectors.toMap(item -> item.getKey(), item -> item.getValue()));

        result.entrySet()
                .forEach(
                        item ->
                                System.out.println(
                                        "first = "
                                                + item.getKey()
                                                + ", value = "
                                                + item.getValue()));

        final var lastResult =
                result.entrySet().toArray(item -> new int[][] {new int[] {item}, new int[] {item}});
        Arrays.asList(lastResult)
                .forEach(
                        item ->
                                System.out.println(
                                        "size = " + item.length + ", first = " + item[0]));

        //                        .entrySet()
        //                .entrySet()
        //                .toArray(item -> new int[][]{item});
        // .toArray(index -> new int[][]{new int[]{index}, new int[]{index}});
        return new int[][] {};
        //        return result.entrySet()
        //                .stream()
        //        //.to.toArray(Integer);
        //        .toArray(item -> new int[][]{item})
    }

    int[] calculate1(int[][] a) {
        // final Map<Integer, Long> result =
        // final Map<Integer, Map<Object, Object>> result =
        final Map<Integer, Integer> result =
                IntStream.range(0, a.length)
                        .boxed()
                        // single-dimensioned array
                        // .collect(Collectors.groupingBy(Function.identity(),
                        // Collectors.toMap(index -> index,
                        // index -> index)));
                        // .collect(Collectors.groupingBy(Function.identity(),
                        // Collectors.toMap(index -> index,
                        // index -> a[index])));
                        // double
                        // .collect(Collectors.groupingBy(Function.identity(),
                        // Collectors.toMap(index -> index,
                        // index -> a[index][0])));
                        // .collect(Collectors.groupingBy(Function.identity(),
                        // Collectors.summingInt(index ->
                        // a[index][0])));
                        .collect(
                                Collectors.groupingBy(
                                        Function.identity(),
                                        Collectors.summingInt(
                                                index ->
                                                        Arrays.stream(a[index]).sum()
                                                                / a[index].length)));
        System.out.println("============================================================");
        result.entrySet()
                .forEach(item -> System.out.println(item.getKey() + ", " + item.getValue()));

        return new int[] {};
    }
}
