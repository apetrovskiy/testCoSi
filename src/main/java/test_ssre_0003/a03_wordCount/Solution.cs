namespace test_ssre_0003.a03_wordCount
{
    using System.Linq;

    public class Solution
    {
        public int wordCount(char[][] board, string word)
        {
            var numberInRows = board.Select((char[] row) => wordCountInRow(row, word)).Sum();
            return numberInRows;
        }


        private int wordCountInRow(char[] row, string word)
        {
            var rowString = new string(row);
            var result = 0;
            var i = 0;
            while (rowString.Length >= word.Length)
            {
                if (rowString.IndexOf(word) > 0)
                {
                    result++;
                    rowString = rowString.Substring(rowString.IndexOf(word));
                }
            }
            return result;
        }
    }
}
