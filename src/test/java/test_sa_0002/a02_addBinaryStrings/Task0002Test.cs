namespace addBinaryStrings {

using NUnit.Framework;
using addBinaryStrings;

    class Task0002Test {
        [Test]
        public void Task0002V1() {
            var c = new Task0002();
            var expectedResult = "1111";
            Assert.AreEqual(expectedResult, c.addBinaryStrings("1000", "111"));
        }
    }
}