import allure
from unittest.case import TestCase
import unittest
from src.main.java.training.graphs.a01_kingdom_roads.a01_new_road_system.solution import (
    newRoadSystem,
)

ROAD_REGISTER_01 = [
    [False, True, False, False],
    [False, False, True, False],
    [True, False, False, True],
    [False, False, True, False],
]
EXPECTED_RESULT_01 = True

ROAD_REGISTER_02 = [
    [False, True, False, False, False, False, False],
    [True, False, False, False, False, False, False],
    [False, False, False, True, False, False, False],
    [False, False, True, False, False, False, False],
    [False, False, False, False, False, False, True],
    [False, False, False, False, True, False, False],
    [False, False, False, False, False, True, False],
]
EXPECTED_RESULT_02 = True

ROAD_REGISTER_03 = [[False, True, False], [False, False, False], [True, False, False]]
EXPECTED_RESULT_03 = False


@allure.epic("epic Challenges")
@allure.feature("feature Challenges by date")
@allure.story("story New road system")
@allure.parent_suite("suite Python")
@allure.tag("tag Python")
class NewRoadSystemTest(TestCase):
    @allure.title("test Case 01")
    def test_new_road_system_case_01(self):
        self.assertEqual(EXPECTED_RESULT_01, newRoadSystem(ROAD_REGISTER_01))

    @allure.title("test Case 02")
    def test_new_road_system_case_02(self):
        self.assertEqual(EXPECTED_RESULT_02, newRoadSystem(ROAD_REGISTER_02))

    @allure.title("test Case 03")
    def test_new_road_system_case_03(self):
        self.assertEqual(EXPECTED_RESULT_03, newRoadSystem(ROAD_REGISTER_03))


if __name__ == "__main__":
    unittest.main()
