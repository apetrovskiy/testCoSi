namespace test_lea_0003.a01_evenDigitsNumber
{
    using NUnit.Framework;

    public class EvenDigitsNumberTest
    {
        [Test]
        public void test()
        {
            var actualResult = new EvenDigitsNumber().evenDigitsNumber(new int[] { 12, 134, 111, 1111, 10 });
            Assert.AreEqual(3, actualResult);
        }
    }
}