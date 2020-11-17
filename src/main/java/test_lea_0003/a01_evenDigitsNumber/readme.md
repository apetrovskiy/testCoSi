Given an array of positive integers a, your task is to calculate how many of its elements have an even number of digits.

Example

For a = [12, 134, 111, 1111, 10], the output should be evenDigitsNumber(a) = 3.

a[0] = 12 has 2 digits, which is an even number.
a[1] = 134 has 3 digits, which is not an even number.
a[2] = 111 has 3 digits, which is not an even number.
a[3] = 1111 has 4 digits, which is an even number.
a[4] = 10 has 2 digits, which is an even number.
There are 3 elements (a[0], a[3], and a[4]) with an even number of digits, so the answer is 3.

Input/Output

[execution time limit] 4 seconds (py3)

[input] array.integer a

An array of positive integers.

Guaranteed constraints:
1 ≤ a.length ≤ 1000,
1 ≤ a[i] ≤ 104.

[output] integer

The number of elements in a that have an even number of digits.

[Python 3] Syntax Tips

# Prints help message to the console
# Returns a string
def helloWorld(name):
    print("This prints to the console when you Run Tests")
    return "Hello, " + name
