Implement the missing code, denoted by ellipses. You may not modify the pre-existing code.

A spider is standing at the origin (0, 0) of a Cartesian plane and wants to move to the point (x, y). At each step, the spider can only move one square in two of the four directions: U(up), D(down,), L(left), R(right), depending on where it is heading:

    if x ≥ 0, y ≥ 0. The spider can only go U or R.
    if x ≥ 0, y ≤ 0. The spider can only go D or R.
    if x ≤ 0, y ≥ 0. The spider can only go U or L.
    if x ≤ 0, y ≤ 0. The spider can only go D or L.

Find the number of ways for the spider to get to the given point (x, y).

Example

    For x = 2 and y = -2, the output should be
    spiderMove(x, y) = 6.

    There are only 6 ways:
        RRDD;
        RDRD;
        RDDR;
        DRRD;
        DRDR;
        DDRR.

    For x = -3 and y = 0, the output should be
    spiderMove(x, y) = 1.

    There is only one way:
        LLL.

    For x = 0 and y = 0, the output should be
    spiderMove(x, y) = 1.

Input/Output

    [execution time limit] 3 seconds (java)

    [input] integer x

    Guaranteed constraints:
    -15 ≤ x ≤ 15.

    [input] integer y

    Guaranteed constraints:
    -5 ≤ y ≤ 25.

    [output] integer

    It is guaranteed that the answer is smaller than 231.

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

