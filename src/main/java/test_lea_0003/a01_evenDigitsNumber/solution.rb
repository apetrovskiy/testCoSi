def evenDigitsNumber(a)
    return a.inject(0){|sum,x| sum + is_even(x) }
end

def is_even(number)
    if number < 10 or (number >= 100 and number < 1000)
        return 0
    end
    if number < 100 or (number >= 1000 and number < 10000)
        return 1
    end
    return 0
end
