using NUnit.Framework;

namespace test_ssre_0003.a01_spiderMove
{
    public class SolutionTest
    {
                [Test]
        public void Test0001()
        {
            var actualResult = new Solution().wordCount(new char[][] { new char[] { 's', 'o', 's', 'o' }, new char[] { 's', 'o', 'o', 's' }, new char[] { 's', 's', 's', 's' } }, "sos");
            Assert.AreEqual(3, actualResult);
        }
    }
}