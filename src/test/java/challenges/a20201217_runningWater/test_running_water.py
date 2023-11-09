from src.main.java.challenges.a20201217_runningWater.solution3 import runningWater
import allure
import pytest
from typing import List


test_data = [
    ([1, 1, 1], 2, True),
    ([16, 5, 3], 20, False),
    ([80, 61, 76], 80, True),
    ([1, 50, 100], 144, True),
    ([7, 4, 7], 15, False),
    ([19, 44, 67], 113, False),
    ([8, 5, 3], 10, True),
    ([2, 4, 8], 13, False),
    ([31, 46, 61], 51, True),
    ([57, 30, 11], 65, True),
]


@allure.epic("epic Challenges")
@allure.feature("feature Challenges by date")
@allure.story("story Running water")
@allure.parent_suite("suite Python")
@allure.title("test Python")
@allure.tag("tag Python")
# @pytest.mark.skip(reason="TODO: no way of currently testing this")
@pytest.mark.parametrize("cap,volume,expected_result", test_data)
def test_running_water(cap: List[int], volume: int, expected_result: bool):
    assert expected_result == runningWater(cap, volume)
