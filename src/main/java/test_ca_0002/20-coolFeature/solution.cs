namespace coolFeature
{
    using System;
    using System.Linq;

    public class Solution
    {
        public int[] coolFeature(int[] a, int[] b, int[][] query)
        {
            var updatedB = Enumerable.Range(0, query.Length - 1)
            .Select(index => 3 == query[index].Length ? query[index][2] : b[index]).ToArray<int>();
            // updatedB.ToList().ForEach(item => Console.WriteLine(item));
            var targetValues = query.Select(item => 3 == item.Length ? item[2] : item[1]).Distinct().ToArray<int>();
            var resultCollection = targetValues
            .Select(val => a
                .Where(a => a <= val)
                .Select(a => updatedB
                    .Where(b => b == val - a)
                    .Count())
                .Count())
            .ToArray<int>();
            return new int[] { 1 };
        }
    }
}
