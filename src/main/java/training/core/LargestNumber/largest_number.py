def largestNumber(n):
    result = 9
    i = 1
    while i < n:
        result += 9 * pow(10, i)
    return result
