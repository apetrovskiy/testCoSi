You're given an array of non-negative integers. Your task is to rearrange its elements in such a way that any 2 adjacent elements sum up to a perfect square. If there are several answers, output the lexicographically smallest one. If there are no possible answers, return an empty array.

Example

For a = [12, 5, 4, 13], the output should be [5, 4, 12, 13].

All adjacent elements sum to perfect squares:

5 + 4 = 9 = 32
4 + 12 = 16 = 42
12 + 13 = 25 = 52
Note: [13, 12, 4, 5] is another possible arrangement, but [5, 4, 12, 13] is smaller lexicographically.

Input / Output

[execution time limit] 4 seconds (py3)

[input] array.integer a

An array of integers that we'd like to arrange in such a way that every pair of adjacent elements add up to a square number.

Guaranteed constraints:
2 ≤ a.length ≤ 500
0 ≤ a[i] ≤ 109

[output] array.integer

An array of integers containing the elements of a arranged such that each adjacent pair adds to a perfect square, in the lexicographically smallest way (or [] if it's not possible).

[Python 3] Syntax Tips

# Prints help message to the console
# Returns a string
def helloWorld(name):
    print("This prints to the console when you Run Tests")
    return "Hello, " + name
