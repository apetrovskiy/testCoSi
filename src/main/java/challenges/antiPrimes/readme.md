Find the nth Highly Composite number.

A highly composite number is a positive integer with more divisors than any smaller positive integer has.

For example:

Number	Divisors	Total Divisors	nth Highly Composite Number
1	1	1	1
2	1,2	2	2
3	1,3	2	
4	1,2,4	3	3
5	1,5	2	
6	1,2,3,6	4	4
First highly composite number is 1 since there are no numbers before it. Second is 2 because it has 1 more divisor than 1. Then 4 because it has 3, which is more than any number before it.

Solve for the nth highly composite number.

Example
For n = 3, the output should be
antiPrimes(n) = 4.

Input/Output

[execution time limit] 4 seconds (rb)

[input] integer n

Guaranteed constraints:
1 ≤ n ≤ 135.

[output] integer64

[Ruby] Syntax Tips

# Prints help message to the console
# Returns a string
def helloWorld(name)
    print "This prints to the console when you Run Tests"
    return "Hello, " + name
end
