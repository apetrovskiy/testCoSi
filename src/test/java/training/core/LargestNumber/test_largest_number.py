import allure
import pytest
from src.main.java.training.core.LargestNumber.largest_number import largestNumber

test_data = [(1, 9), (2, 99), (3, 999), (9, 999999999)]


@allure.epic("Challenges")
@allure.feature("Challenges")
@allure.story("Largest number")
@allure.title("Python")
@allure.tag("Python")
@pytest.mark.parametrize("input,expected_result", test_data)
def test_largest_number(input: int, expected_result: int):
    assert expected_result == largestNumber(input)
