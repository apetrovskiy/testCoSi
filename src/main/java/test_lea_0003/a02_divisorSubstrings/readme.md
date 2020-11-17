You are given two integers, n and k. Consider the string representation of n, and find the number of distinct substrings of length k, such that n is divisible by the number formed by that substring. In other words, how many different numbers formed by k consecutive digits of n are factors of n?

Note: The k-digit substrings may have leading zeros.

Example

For n = 120 and k = 2, the output should be divisorSubstrings(n, k) = 2.

The divisor substrings are 12 and 20 (120 is divisible by both of these).

For n = 555 and k = 1, the output should be divisorSubstrings(n, k) = 1.

All the substrings of length 1 are equal to 5 which is a divisor of 555. The answer is not 3 since we're only counting distinct numbers.

For n = 5341 and k = 2, the output should be divisorSubstrings(n, k) = 0.

5341 is not divisible by 53, 34 nor 41, so the answer is 0.

Input/Output

[execution time limit] 3 seconds (java)

[input] integer n

An integer representing the number we're trying to find the substring factors of.

Guaranteed constraints:
1 ≤ n ≤ 109.

[input] integer k

An integer representing how many digits long the substrings should be.

Guaranteed constraints:
1 ≤ k ≤ 10,
10k - 1 ≤ n.

[output] integer

The number of distinct substrings of length k which are factors of n.

[Java] Syntax Tips

// Prints help message to the console
// Returns a string
// 
// Globals declared here will cause a compilation error,
// declare variables inside the function instead!
String helloWorld(String name) {
    System.out.println("This prints to the console when you Run Tests");
    return "Hello, " + name;
}

Java
1234
int divisorSubstrings(int n, int k) {

}

TESTS
CUSTOM TESTS
Test 1
Test 2
Test 3
Test 4
Test 5
Test 6
Test 7
Test 8
Test 9
Test 10
Test 11
Test 12
Test 13
Test 14
Test 15
Test 16
Test 17
Test 18
Test 19
Test 20
Test 21
Formatting
Editor Mode
VS Code
Theme
Dark
Tab Size
Auto
Font Size
14px
Auto-brackets
Minimap
Code Completion
Error Highlighting
Hotkeys
CTRL/CMD + Enter
Submit
CTRL/CMD + R
Run
CTRL/CMD + S
Save
CTRL/CMD + Shift + >
Tab Right
CTRL/CMD + Shift + <
Tab Left
MORE
