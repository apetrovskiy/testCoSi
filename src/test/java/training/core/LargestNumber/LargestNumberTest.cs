namespace training.core.LargestNumber
{
    using System;
    using NUnit.Framework;
    using NUnit.Allure.Attributes;
    using NUnit.Allure.Core;


    [TestFixture]
    [AllureNUnit]
    [AllureEpic("epic Training")]
    [AllureFeature("feature Core")]
    [AllureStory("story Largest number")]
    [AllureSuite("suite C#")]
    [AllureTag("tag C#")]
    class LargestNumberTest
    {
        private Solution cut;
        [SetUp]
        public void SetUp()
        {
            cut = new Solution();
        }

        [TestCaseSource(nameof(GetInputData))]
        [AllureName("test Largest number")]
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
