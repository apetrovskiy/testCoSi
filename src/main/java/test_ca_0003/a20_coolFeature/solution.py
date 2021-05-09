def coolFeature(a, b, query):
    raw_result = [work_on_query_element(a, b, x) for x in query]
    return [x for x in raw_result if x != -100]

def work_on_query_element(a, b, query_element):
    if query_element[0] == 0:
        b[query_element[1]] = query_element[2]
        return -100
    else:
        return find_number(a, b, query_element[1])

def find_number(array_a, array_b, number):
    # result = 0
    # for a1 in array_a:
    #     for b1 in array_b:
    #         if number == a1 + b1:
    #             result += 1
    # return result
    raw = [1 if number == a1 + b1 else 0 for a1 in array_a for b1 in array_b]
    return sum(raw)
