from src.main.java.test_lea_0003.a02_divisorSubstrings.solution import sum_of_divisors
import pytest


@pytest.mark.parametrize(
    "input_data,group_length,expected_result",
    [
        (120, 2, 2),
        (555, 1, 1),
        (5341, 2, 0),
    ],
)
def test_solution_marathon_task_score(input_data: int, group_length: int, expected_result: int):
    assert expected_result == sum_of_divisors(input_data, group_length)
