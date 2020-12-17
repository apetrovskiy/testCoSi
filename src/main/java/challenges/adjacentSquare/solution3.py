from math import sqrt


def adjacentSquare(a):
    result = []
    possible_pairs = []
    
    for x in a:
        possible_pairs += [(x, y) if x <= y else (y, x) for y in a if pow(round(sqrt(x + y)), 2) == x + y]
    possible_pairs.sort()
    possible_pairs = set(possible_pairs)

    print(possible_pairs)
    
    return result
