You are given a two-digit integer n. Return the sum of its digits.

Example

For n = 29, the output should be
addTwoDigits(n) = 11.

Input/Output

    [execution time limit] 9 seconds (st)

    [input] integer n

    A positive two-digit integer.

    Guaranteed constraints:
    10 ≤ n ≤ 99.

    [output] integer

    The sum of the first and second digits of the input number.

[Smalltalk] Syntax Tips

" Prints help message to the console
  Returns a string"
Object subclass: helloWorld [
    name: name [
        Transcript show: 'This prints to the console when you Run Tests'.
        ^'Hello, ' , name.
    ]
]
