def mergeStrings(s1, s2):
    first_array = []
    second_array = []
    first_array[:0] = s1
    second_array[:0] = s2
    # print(first_array)
    # print(second_array)
    result = ""
    while (len(first_array) + len(second_array)) > 0:
        if len(first_array) == 0:
            result += ''.join(second_array)
            return result
        if len(second_array) == 0:
            result += ''.join(first_array)
            return result
        first_array_char = first_array.pop(0)
        second_array_char = second_array.pop(0)
        # print(first_array_char)
        # print(second_array_char)
        if s1.count(first_array_char) < s2.count(second_array_char):
            # print("first = " + first_array_char)
            result += first_array_char
            second_array.insert(0, second_array_char)
        elif s1.count(first_array_char) > s2.count(second_array_char):
            # print("second = " + second_array_char)
            result += second_array_char
            first_array.insert(0, first_array_char)
        else:
            if ord(first_array_char) <= ord(second_array_char):
                # print("use first = " + first_array_char)
                result += first_array_char
                second_array.insert(0, second_array_char)
            if ord(first_array_char) > ord(second_array_char):
                # print("use second = " + second_array_char)
                result += second_array_char
                first_array.insert(0, first_array_char)
    return result
