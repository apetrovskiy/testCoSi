Given a rectangular matrix of English lowercase letters board and a string word, your task is to find the number of occurrences of word in the rows(→), columns(↓) and diagonals(↘) of board.

Example

    For

    board = [['s', 'o', 's', 'o'],
             ['s', 'o', 'o', 's'],
             ['s', 's', 's', 's']]

    and word = "sos", the output should be wordCount(board, word) = 3.

    There are 2 occurrences of word starting from board[0][0](going → and ↘), and one starting from board[0][2](going ↓).

    No other occurrences of word were counted, so the answer is 3.

    For

    board = [['a', 'a'],
             ['a', 'a']]

    and word = "aa", the output should be
    wordCount(board, word) = 5.

    There are 2 horizontal, 2, vertical, and 1 diagonal occurrence of word, for a total of 5.

Input/Output

    [execution time limit] 0.5 seconds (cpp)

    [input] array.array.char board

    A rectangular matrix of lowercase English letters.

    Guaranteed constraints:
    1 ≤ board.length ≤ 100,
    1 ≤ board[0].length ≤ 100,
    board[i].length = board[0].length.

    [input] string word

    A string consisting of lowercase English letters.

    Guaranteed constraints:
    2 ≤ word.length ≤ 100.

    [output] integer

    The number of occurrences of word in the rows(→), columns(↓) and diagonals(↘) of board.

[C++] Syntax Tips

// Prints help message to the console
// Returns a string
std::string helloWorld(std::string name) {
    std::cout << "This prints to the console when you Run Tests" << std::endl;
    return "Hello, " + name;
}
