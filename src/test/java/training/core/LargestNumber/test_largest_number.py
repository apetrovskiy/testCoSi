import allure
import pytest
from src.main.java.training.core.LargestNumber.largest_number import largestNumber

test_data = [(1, 9), (2, 99), (3, 999), (9, 999999999)]


@allure.epic("epic Training")
@allure.feature("feature Core")
@allure.story("story Largest number")
@allure.parent_suite("suite Python")
@allure.title("test Python")
@allure.tag("tag Python")
@pytest.mark.parametrize("input,expected_result", test_data)
def test_largest_number(input: int, expected_result: int):
    assert expected_result == largestNumber(input)
