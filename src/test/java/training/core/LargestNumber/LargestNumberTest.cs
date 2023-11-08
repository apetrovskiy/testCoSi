namespace training.core.LargestNumber
{
    using System;
    using NUnit.Framework;
    using NUnit.Allure.Attributes;
    using NUnit.Allure.Core;
    using NUnit.Framework;

    [TestFixture]
    [NUnit.Allure.Core.AllureNUnit]

    [AllureEpic("Training")]
    [AllureFeature("Core")]
    [AllureStory("C#")]
    [AllureSuite("C#")]
    [AllureTag("C#")]
    class LargestNumberTest
    {
        private Solution cut;
        [SetUp]
        public void SetUp()
        {
            cut = new Solution();
        }

        [TestCaseSource(nameof(GetInputData))]
        [AllureName("LargestNumber")]
        public void ShouldCalculateTheLargestNumber(int input, int expectedResult)
        {
            Console.WriteLine(cut.largestNumber(input));
            Assert.That(cut.largestNumber(input), Is.EqualTo(expectedResult));
        }

        static object[] GetInputData = {
            new object[] {      1, 9},
    new object[] {2, 99},
      new object[] {3, 999},
     new object[] {9, 999_999_999}
        };
    }
}
