def addTwoDigits(n)
    if 10 > n or 99 < n
        return 0
    end

    return n % 10 + ((n - (n % 10)) / 10)
end

print addTwoDigits 29
