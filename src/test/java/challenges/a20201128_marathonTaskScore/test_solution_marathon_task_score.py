import pytest
from typing import List
from src.main.java.testCodi.a02CyclicRotation.solution import solution


@pytest.mark.parametrize(
    "input_array,shift,expected_result",
    [
        ([3, 8, 9, 7, 6], 3, [9, 7, 6, 3, 8]),
        ([0, 0, 0], 1, [0, 0, 0]),
        ([1, 2, 3, 4], 4, [1, 2, 3, 4]),
    ],
)
def test_solution_cyclic_rotation(input_array: List[int], shift: int, expected_result: List[int]):
    assert expected_result == solution(input_array, shift)
