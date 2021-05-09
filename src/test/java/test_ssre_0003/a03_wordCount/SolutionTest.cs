namespace test_ssre_0003.a03_wordCount
{
    using NUnit.Framework;

    public class SolutionTest
    {
        [Test]
        public void Test0001()
        {
            var actualResult = new Solution().wordCount(new char[][] { new char[] { 's', 'o', 's', 'o' }, new char[] { 's', 'o', 'o', 's' }, new char[] { 's', 's', 's', 's' } }, "sos");
            Assert.AreEqual(3, actualResult);
        }

        [Test]
        public void Test0002()
        {
            var actualResult = new Solution().wordCount(new char[][] { new char[] { 'a', 'a' }, new char[] { 'a', 'a' } }, "aa");
            Assert.AreEqual(5, actualResult);
        }

        [Test]
        public void Test0003()
        {
            var actualResult = new Solution().wordCount(new char[][] { new char[] { 'c', 'o', 'd', 'e', 's', 'i', 'g', 'n', 'a', 'l' } }, "codesignal");
            Assert.AreEqual(1, actualResult);
        }

        [Test]
        public void Test0004()
        {
            var actualResult = new Solution().wordCount(new char[][] {new char[]{'c'},
 new char[]{'o'},
 new char[]{'d'},
 new char[]{'e'},
new char[] {'s'},
new char[] {'i'},
 new char[]{'g'},
new char[] {'n'},
 new char[]{'a'},
 new char[]{'l'}}, "codesignal");
            Assert.AreEqual(1, actualResult);
        }

        [Test]
        public void Test0005()
        {
            var actualResult = new Solution().wordCount(new char[][] { new char[] {'a','b','c'},
new char[] {'a','b','c'}}, "codesignal");
            Assert.AreEqual(2, actualResult);
        }

        [Test]
        public void Test0006()
        {
            var actualResult = new Solution().wordCount(new char[][] { new char[] { 'z', 'z', 'z' }, new char[] { 'z', 'z', 'z' }, new char[] { 'z', 'z', 'z' } }, "zz");
            Assert.AreEqual(16, actualResult);
        }

        [Test]
        public void Test0007()
        {
            var actualResult = new Solution().wordCount(new char[][] { new char[] {'h','o','h','o','h','o'},
 new char[] {'o','h','o','h','o','h'},
 new char[] {'h','o','h','o','h','o'},
 new char[] {'o','h','o','h','o','h'},
 new char[] {'h','o','h','o','h','o'},
 new char[] {'o','h','o','h','o','h'} }, "hohoho");
            Assert.AreEqual(6, actualResult);
        }

        [Test]
        public void Test0008()
        {
            var actualResult = new Solution().wordCount(new char[][] {  new char[] {'l','l','l','l','l'},
  new char[] {'o','o','o','o','o'},
  new char[] {'l','l','l','l','l'} }, "lol");
            Assert.AreEqual(8, actualResult);
        }

        [Test]
        public void Test0009()
        {
            var actualResult = new Solution().wordCount(new char[][] { new char[] { 'c', 'c', 'o', 'd', 'e'},
new char[] { 'o', 'c', 'o', 'd', 'e' },
new char[] { 'd', 't', 'o', 'd', 't' },
new char[] { 'e', 't', 't', 'd', 'e' },
new char[] { 'a', 'b', 'c', 'd', 'e' } }, "code");
            Assert.AreEqual(5, actualResult);
        }

        [Test]
        public void Test0010()
        {
            var actualResult = new Solution().wordCount(new char[][] {  new char[] {'l','l','l','l','l'},
  new char[] {'x'} }, "oops");
            Assert.AreEqual(0, actualResult);
        }
    }
}

/*
001
Input:
board:
[["s","o","s","o"], 
 ["s","o","o","s"], 
 ["s","s","s","s"]]
word: "sos"
Output:
undefined
Expected Output:
3

002
Input:
board:
[["a","a"], 
 ["a","a"]]
word: "aa"
Output:
undefined
Expected Output:
5

003
Input:
board: [["c","o","d","e","s","i","g","n","a","l"]]
word: "codesignal"
Output:
undefined
Expected Output:
1

004
Input:
board:
[["c"], 
 ["o"], 
 ["d"], 
 ["e"], 
 ["s"], 
 ["i"], 
 ["g"], 
 ["n"], 
 ["a"], 
 ["l"]]
word: "codesignal"
Output:
undefined
Expected Output:
1

005
Input:
board:
[["a","b","c"], 
 ["a","b","c"]]
word: "abc"
Output:
undefined
Expected Output:
2

006
Input:
board:
[["z","z","z"], 
 ["z","z","z"], 
 ["z","z","z"]]
word: "zz"
Output:
undefined
Expected Output:
16
*/
/*
007
Input:
board:
[["h","o","h","o","h","o"], 
 ["o","h","o","h","o","h"], 
 ["h","o","h","o","h","o"], 
 ["o","h","o","h","o","h"], 
 ["h","o","h","o","h","o"], 
 ["o","h","o","h","o","h"]]
word: "hohoho"
Output:
undefined
Expected Output:
6

008
Input:
board:
[["l","l","l","l","l"], 
 ["o","o","o","o","o"], 
 ["l","l","l","l","l"]]
word: "lol"
Output:
undefined
Expected Output:
8
*/
/*
009
Input:
board:
[["c","c","o","d","e"], 
 ["o","c","o","d","e"], 
 ["d","t","o","d","t"], 
 ["e","t","t","d","e"], 
 ["a","b","c","d","e"]]
word: "code"
Output:
undefined
Expected Output:
5

010
Input:
board: [["x"]]
word: "oops"
Output:
undefined
Expected Output:
0

*/
