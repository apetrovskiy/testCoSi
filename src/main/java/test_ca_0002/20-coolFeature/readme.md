You are developing a new programming language. You believe that ordinary dictionaries are boring, so you've decided to add a cool feature to make your language unique!

You want the cool feature to be able to perform two types of queries. With two arrays, a and b, the two types of queries are as follows:

    If the query is of the form [0, i, x], then b[i] should be assigned the value of x.
    If the query is of the form [1, x], then find the total number of pairs of indices i and j such that a[i] + b[j] = x.

You will be given the arrays of integers a and b, as well as query, an array of queries in either of the forms described above. Your task is to implement this cool feature, perform the given queries and return an array of the results of the queries of the second type.

Example

    For a = [1, 2, 3], b = [3, 4], and query = [[1, 5], [0, 0, 1], [1, 5]], the output should be coolFeature(a, b, query) = [2, 1].

    The arrays look like this before the first query:
    a = [1, 2, 3] and b = [3, 4]
    There are two ways to form a sum of 5 using an element from each array: 5 = 1 + 4 = a[0] + b[1] and 5 = 2 + 3 = a[1] + b[0]. So the result is 2.

    The second query re-assigns the value of b[0] to 1, so the arrays look like this before the third query:
    a = [1, 2, 3] and b = [1, 4]
    There's now only one way to form a sum of 5 using an element from each array: 5 = 1 + 4 = a[0] + b[1]. So the result is 1.

    Since the two queries of type 1 gave results of 2 and 1, the answer is [2, 1].

    For a = [1, 2, 2], b = [2, 3], and query = [[1, 4], [0, 0, 3], [1, 5]], the output should be coolFeature(a, b, query) = [3, 4].

    The arrays look like this before the first query:
    a = [1, 2, 2] and b = [2, 3]
    There are three ways to form a sum of 4 using an element from each array: 4 = 1 + 3 = a[0] + b[1], 4 = 2 + 2 = a[1] + b[0], and 4 = 2 + 2 = a[2] + b[0]. So the result is 3.

    The second query re-assigns the value of b[0] to 3, so the arrays look like this before the third query:
    a = [1, 2, 2] and b = [3, 3]
    There are now 4 ways to form a sum of 5 using an element from each array: 5 = 2 + 3 = a[1] + b[0], 5 = 2 + 3 = a[1] + b[1], 5 = 2 + 3 = a[2] + b[0], and 5 = 2 + 3 = a[2] + b[1]. So the result is 4.

Input/Output

    [execution time limit] 1 seconds (cs)

    [input] array.integer a

    An array of integers.

    Guaranteed constraints:
    1 ≤ a.length ≤ 103,
    0 ≤ a[i] ≤ 109.

    [input] array.integer b

    An array of integers.

    Guaranteed constraints:
    1 ≤ b.length ≤ 5 · 104,
    0 ≤ b[i] ≤ 109.

    [input] array.array.integer query

    An array of queries, where query[i][0] represents the type of query, and the other elements represent the parameters of the query (i and x for type 0, and just x for type 1).

    For the first type of query, it is guaranteed that 0 ≤ query[i][1] < b.length and 0 ≤ query[i][2] ≤ 109.
    For the second type of query, it is guaranteed that 0 ≤ query[i][1] ≤ 2 · 109

    Guaranteed constraints:
    1 ≤ query.length ≤ 103.

    [output] array.integer

    The outputs of the queries of the second type, in the order they are given in the input.

[C#] Syntax Tips

// Prints help message to the console
// Returns a string
string helloWorld(string name) {
    Console.Write("This prints to the console when you Run Tests");
    return "Hello, " + name;
}

