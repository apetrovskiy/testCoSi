namespace coolFeature
{
    using Xunit;

    public class SolutionTest
    {
        [Fact]
        public void Test001()
        {
            Assert.Equal(
                new int[] { 2, 1 },
                new Solution().coolFeature(
                    new int[] { 1, 2, 3 },
                    new int[] { 3, 4 },
                    new int[][] { new int[] { 1, 5 }, new int[] { 0, 0, 1 }, new int[] { 1, 5 } }));
        }

        [Fact]
        public void Test002()
        {
            Assert.Equal(
                new int[] { 3, 4 },
                new Solution().coolFeature(
                    new int[] { 1, 2, 2 },
                    new int[] { 2, 3 },
                    new int[][] { new int[] { 1, 4 }, new int[] { 0, 0, 3 }, new int[] { 1, 5 } }));
        }
    }
}
