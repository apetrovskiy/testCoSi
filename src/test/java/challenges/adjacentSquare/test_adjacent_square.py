from typing import List
import pytest


test_data = [
    ([12, 5, 4, 13], [5, 4, 12, 13]),
]

@pytest.mark.parameterize("input_array,expected_result", test_data)
def test_adjacent_square(input_array: List[int], expected_result: List[int]):
    assert expected_result == adjacentSquare(input_array)
