namespace training.core.LargestNumber
{
    using System;
    public class Solution
    {
        public int largestNumber(int n)
        {
            var result = 9;
            for (var i = 1; i < n; i++)
                result += 9 * Convert.ToInt32(Math.Pow(10.0, Convert.ToDouble(i)));
            return result;
        }
    }
}
