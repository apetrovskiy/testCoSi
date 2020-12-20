from src.main.java.tpm.code001.code import addTwoDigits
import pytest


test_data = [(10, 1), (99, 18), (22,4),]

@pytest.mark.parametrize("number,expected_result", test_data)
def test_add_two_digits(number: int, expected_result: int):
    assert expected_result == addTwoDigits(number)
