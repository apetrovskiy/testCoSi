import pytest
from typing import List
from src.main.java.challenges.a20200530_combinationSum.solution3 import combinationSum


@pytest.mark.parametrize(
    "input_array,sum,expected_result",
    [
        ([2, 3, 5, 9], 9, "(2 2 2 3)(2 2 5)(3 3 3)(9)"),
        ([2, 4, 6, 8], 8, "(2 2 2 2)(2 2 4)(2 6)(4 4)(8)"),
        ([8, 1, 8, 6, 8], 12, "(1 1 1 1 1 1 1 1 1 1 1 1)(1 1 1 1 1 1 6)(1 1 1 1 8)(6 6)"),
        ([7, 2, 6, 5], 16, "(2 2 2 2 2 2 2 2)(2 2 2 2 2 6)(2 2 2 5 5)(2 2 5 7)(2 2 6 6)(2 7 7)(5 5 6)"),
        # TODO: more tests
    ],
)
def test_combinationSum(input_array: List[int], sum: int, expected_result: str):
    assert expected_result == combinationSum(input_array, sum)
