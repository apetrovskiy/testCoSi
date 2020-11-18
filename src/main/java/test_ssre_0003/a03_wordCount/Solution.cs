namespace test_ssre_0003.a03_wordCount
{
    using System;
    using System.Linq;

    public class Solution
    {
        public int wordCount(char[][] board, string word)
        {
            var numberInRows = board.Select((char[] row) =>
            {
                Console.WriteLine($"{row}");
                return wordCountInRow(row, word);
            }).Sum();
            return numberInRows;
        }


        private int wordCountInRow(char[] row, string word)
        {
            var rowString = new string(row);
            var result = 0;
            Console.WriteLine($"before: {rowString}, {word}");
            Console.WriteLine($"before: {rowString.Length}");
            Console.WriteLine($"before: {rowString.IndexOf(word)}");
            while (rowString.Length >= word.Length)
            {
                Console.WriteLine(rowString);
                Console.WriteLine($"{rowString.IndexOf(word)}");
                if (rowString.IndexOf(word) == -1)
                {
                    break;
                }
                else
                {
                    result++;
                    rowString = rowString.Substring(rowString.IndexOf(word) + 1);
                }
                Console.WriteLine($"{rowString.Length >= word.Length}");
            }
            return result;
        }
    }
}
