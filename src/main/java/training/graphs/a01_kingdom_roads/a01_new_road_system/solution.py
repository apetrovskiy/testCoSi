from typing import List


def newRoadSystem(roadRegister):
    return [horiz for horiz in roadRegister for vert in horiz]


def countInArray(city_from: List[bool]):
    return len([x for x in city_from if x])
