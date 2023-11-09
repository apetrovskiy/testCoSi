import allure
from unittest.case import TestCase
import unittest
from src.main.java.training.graphs.a01_kingdom_roads.a02_roads_building.solution import (
    roadsBuilding,
)


@allure.epic("epic Challenges")
@allure.feature("feature Challenges by date")
@allure.story("story Road building")
@allure.suite("suite Python")
@allure.tag("tag Python")
class RoadsBuildingTest(TestCase):
    @allure.title("test road building")
    def test_roads_building(self):
        self.assertEqual(True, roadsBuilding(None, None))


if __name__ == "__main__":
    unittest.main()
