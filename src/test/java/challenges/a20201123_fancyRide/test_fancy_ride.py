import allure
import unittest
from unittest import TestCase
from src.main.java.challenges.a20201123_fancyRide.solution3 import fancyRide


@allure.epic("epic Challenges")
@allure.feature("feature Challenges by date")
@allure.story("story Fancy ride")
@allure.parent_suite("suite Python")
@allure.tag("tag Python")
class FancyRideTest(TestCase):
    @allure.title("test Fancy ride")
    def test_fancy_ride(self):
        self.assertEqual("UberXL", fancyRide(30, [0.3, 0.5, 0.7, 1, 1.3]))


if __name__ == "__main__":
    unittest.main()
