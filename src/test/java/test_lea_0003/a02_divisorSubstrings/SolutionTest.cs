namespace test_lea_0003.a02_divisorSubstrings
{
    using NUnit.Framework;

    public class DivisorSubstringsTest
    {
        private DivisorSubstrings cut;

        [SetUp]
        public void SetUp()
        {
            cut = new DivisorSubstrings();
        }

        [TestCase(120, 2, 2)]
        [TestCase(555, 1, 1)]
        [TestCase(5341, 2, 0)]
        public void test(int inputData, int groupLength, int expectedResult)
        {
            Assert.AreEqual(expectedResult, cut.divisorSubstrings(inputData, groupLength));
        }
    }
}
