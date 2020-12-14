namespace test_lea_0003.a02_divisorSubstrings
{
    using System;
    using System.Linq;

    public class DivisorSubstrings
    {
        public int divisorSubstrings(int n, int k)
        {
            if (0 == n)
                return 0;
            var inputString = n.ToString();
            return Enumerable.Range(0, inputString.Length - k + 1) // - 1) // ) // + 1)
                .Select(index =>
                {
                    var potentialResult = Convert.ToInt32(inputString.Substring(index, k));
                    return 0 == n % potentialResult ? potentialResult : 0;
                })
                .Where(number => 0 != number)
                .Distinct()
                .Count();
        }
    }
}
