from typing import List


def digitAnagrams(a):
    result = 0
    for index in range(len(a) - 1):
        result += number_of_anagrams(a, index)
    return result


def number_of_anagrams(array: List[int], index: int):
    result = 0
    number = array[index]
    for item_index in range(index + 1, len(array)):
        # if ''.join(sorted(str(array[item_index]))) == ''.join(sorted(str(number))):
        if sorted(str(array[item_index])) == sorted(str(number)):
            result += 1
    return result
