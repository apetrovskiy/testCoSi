def sum_of_divisors(input_data: int, group_length: int):
    if input_data == 0:
        return 0
    input_string = str(input_data)
    result_list = []
    for index in range(0, len(input_string) - group_length + 1):
        potential_result: int = int(input_string[index:index + group_length])
        if input_data % potential_result == 0:
            result_list.append(potential_result)
    return len(set(result_list))
