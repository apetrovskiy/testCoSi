from unittest.case import TestCase
import unittest
from src.main.java.training.graphs.a01_kingdom_roads.a02_roads_building.solution import roadsBuilding


class RoadsBuildingTest(TestCase):
    def test_roads_building(self):
        self.assertEqual(True, roadsBuilding(None, None))


if __name__ == '__main__':
    unittest.main()
