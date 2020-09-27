def addTwoDigits(n):
    if 10 > n or 99 < n:
        return 0

    return n % 10 + int((n - (n % 10)) / 10)

print(addTwoDigits(29))
