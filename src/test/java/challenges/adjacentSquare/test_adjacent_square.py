from src.main.java.challenges.adjacentSquare.solution3 import adjacentSquare
from typing import List
import allure
import pytest


test_data = [
    ([12, 5, 4, 13], [5, 4, 12, 13]),
    ([1, 2, 3], []),
    ([1, 1, 1, 3, 3, 3], [1, 3, 1, 3, 1, 3]),
    ([1, 3, 6, 15], [6, 3, 1, 15]),
    ([1, 3, 6, 8], [6, 3, 1, 8]),
    ([1, 3, 6, 8, 24], []),
    ([5, 4, 3, 1, 0], [3, 1, 0, 4, 5]),
    ([1, 0, 0, 0], [0, 0, 0, 1]),
    ([10, 15, 1], [1, 15, 10]),
    ([2, 7, 9, 0, 16, 14], [0, 16, 9, 7, 2, 14]),
]


@allure.epic("epic Challenges")
@allure.feature("feature Challenges by date")
@allure.story("story Adjacent square")
@allure.parent_suite("suite Python")
@allure.title("test Adjacent square")
@allure.tag("tag Python")
# @pytest.mark.skip(reason="TODO: no way of currently testing this")
@pytest.mark.parametrize("input_array,expected_result", test_data)
def test_adjacent_square(input_array: List[int], expected_result: List[int]):
    assert expected_result == adjacentSquare(input_array)
