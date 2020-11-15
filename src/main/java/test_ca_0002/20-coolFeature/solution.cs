namespace coolFeature
{
    using System.Linq;

    public class Solution
    {
        public int[] coolFeature(int[] a, int[] b, int[][] query)
        {
            var result = query
                .Select(queryArrayElement =>
                {
                    if (3 == queryArrayElement.Length)
                    {
                        b[queryArrayElement[1]] = queryArrayElement[2];
                    }
                    return 3 == queryArrayElement.Length && 0 == queryArrayElement[0] ?
                        -1 :
                        calculateQuery(a, b, queryArrayElement[1]);
                    }
                )
                .ToArray<int>();
            return result
                .Where(resultItem => resultItem >= 0)
                .ToArray<int>();
        }
        private int calculateQuery(int[] array1, int[] array2, int currentTarget)
        {
            return array1.Select(array1Item => array2.Count(array2Item => currentTarget - array1Item == array2Item)).Sum();
        }
    }
}
