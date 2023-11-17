import allure
import unittest
from unittest import TestCase
from src.main.java.challenges.a20201121_dailyOHLC.solution3 import dailyOHLC


@allure.epic("epic Challenges")
@allure.feature("feature Challenges by date")
@allure.story("story Daily OHLC")
@allure.parent_suite("suite Python")
@allure.tag("tag Python")
class DailyOHLCTest(TestCase):
    @allure.title("test Daily OHLC")
    def test_dailyOHLC(self):
        self.assertEqual(
            "UberXL",
            dailyOHLC(
                [
                    1450625399,
                    1450625400,
                    1450625500,
                    1450625550,
                    1451644200,
                    1451690100,
                    1451691000,
                ],
                ["HPQ", "HPQ", "HPQ", "HPQ", "AAPL", "HPQ", "GOOG"],
                ["sell", "buy", "buy", "sell", "buy", "buy", "buy"],
                [10, 20.3, 35.5, 8.65, 20, 10, 100.35],
                [10, 1, 2, 3, 5, 1, 10],
                [
                    ["2015-12-20", "HPQ", "10.00", "35.50", "8.65", "8.65"],
                    ["2016-01-01", "AAPL", "20.00", "20.00", "20.00", "20.00"],
                    ["2016-01-01", "GOOG", "100.35", "100.35", "100.35", "100.35"],
                    ["2016-01-01", "HPQ", "10.00", "10.00", "10.00", "10.00"],
                ],
            ),
        )


if __name__ == "__main__":
    unittest.main()
