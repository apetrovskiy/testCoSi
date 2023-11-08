from src.main.java.challenges.spiderMove.solution3 import spiderMove
import allure
import pytest


test_data = [
    (2, -2, 6),
    (-3, 0, 1),
    (0, 0, 1),
    (0, 10, 1),
    (5, 7, 792),
]


@allure.epic("Challenges")
@allure.feature("Challenges")
@allure.story("Spider move")
@allure.title("Python")
@allure.tag("Python")
@pytest.mark.parametrize("x,y,expected_result", test_data)
def test_spider_move(x: int, y: int, expected_result: int):
    assert expected_result == spiderMove(x, y)


"""
Test 1
Input:
x: 2
y: -2
Expected Output:
6

Test 2
Input:
x: -3
y: 0
Expected Output:
1

Test 3
Input:
x: 0
y: 0
Expected Output:
1

Test 4
Input:
x: 0
y: 10
Expected Output:
1

Test 5
Input:
x: 5
y: 7
Expected Output:
792
"""
