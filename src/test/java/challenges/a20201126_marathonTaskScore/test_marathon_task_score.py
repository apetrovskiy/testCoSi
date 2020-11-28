from src.main.java.challenges.a20201126_marathonTaskScore.solution3 import marathonTaskScore
import pytest


@pytest.mark.parametrize(
    "marathon_length,max_score,submissions,successful_submission_time,expected_result",
    [
        (100, 400, 4, 30, 310),
        (100, 400, 95, 30, 200),
        (100, 400, 95, -1, 0),
        (100, 1000, 1, 99, 505),
        (100, 1000, 2, 99, 500),
    ],
)
def test_solution_marathon_task_score(marathon_length: int, max_score: int, submissions: int, successful_submission_time: int, expected_result: int):
    assert expected_result == marathonTaskScore(marathon_length, max_score, submissions, successful_submission_time)
