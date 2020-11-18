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
