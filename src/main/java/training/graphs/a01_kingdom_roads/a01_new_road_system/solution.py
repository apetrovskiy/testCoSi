from typing import List


def newRoadSystem(roadRegister):
    length = len(roadRegister)
    return [(horiz, vert, i, horiz[i]) for i in range(0, length) for horiz in roadRegister for vert in horiz]


def countInArray(city_from: List[bool]):
    pass
