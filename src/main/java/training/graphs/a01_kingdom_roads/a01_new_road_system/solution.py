from typing import List


def newRoadSystem(roadRegister):
    length = len(roadRegister)
    comparison = [count_in_row(roadRegister[i]) == count_in_column(roadRegister, i) for i in range(0, length)]
    return 0 == len([x for x in comparison if not x])

def count_in_array(array: List[bool]):
    return len([x for x in array if x])

def count_in_row(city_from: List[bool]):
    return count_in_array(city_from)

def count_in_column(road_register: List[List[bool]], index: int):
    column = [horiz[index] for horiz in road_register]
    return count_in_array(column)
