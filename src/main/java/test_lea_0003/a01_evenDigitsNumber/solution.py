from typing import List


def even_digits_number(a: List[int]):
    return sum([is_even(x) for x in a])

def is_even(number: int):
    if number < 10 or (number >= 100 and number < 1000):
        return 0
    if number < 100 or (number >= 1000 and number < 10000):
        return 1
    return 0
