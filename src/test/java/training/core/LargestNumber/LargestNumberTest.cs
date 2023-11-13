// <copyright file="LargestNumberTest.cs" company="PlaceholderCompany">
// Copyright (c) PlaceholderCompany. All rights reserved.
// </copyright>

namespace Training.Core.LargestNumber
{
    using System;
    using NUnit.Allure.Attributes;
    using NUnit.Allure.Core;
    using NUnit.Framework;

    [TestFixture]
    [AllureNUnit]
    [AllureEpic("epic Training")]
    [AllureFeature("feature Core")]
    [AllureStory("story Largest number")]
    [AllureSuite("suite C#")]
    [AllureTag("tag C#")]
    internal class LargestNumberTest
    {
        private static object[] getInputData =
        {
            new object[] { 1, 9 },
            new object[] { 2, 99 },
            new object[] { 3, 999 },
            new object[] { 9, 999_999_999 },
        };

        private LargestNumberSolution cut;

        [SetUp]
        public void SetUp()
        {
            this.cut = new LargestNumberSolution();
        }

        [TestCaseSource(nameof(getInputData))]
        [AllureName("test Largest number")]
        public void ShouldCalculateTheLargestNumber(int input, int expectedResult)
        {
            Console.WriteLine(this.cut.LargestNumber(input));
            Assert.That(this.cut.LargestNumber(input), Is.EqualTo(expectedResult));
        }
    }
}
