import unittest
from unittest import TestCase
from src.main.java.challenges.a20201115_spamClusterization.solution3 \
    import spamClusterization

requests = [
    "I need a new window.", "I really, really want to replace my window!",
    "Replace my window.", "I want a new window.",
    "I want a new carpet, I want a new carpet, I want a new carpet.",
    "Replace my carpet"
]
ids = [374, 2845, 83, 1848, 1837, 1500]
threshold = 0.5
expected_result = [[83, 1500], [374, 1837, 1848]]


class SpamClusterizationTest(TestCase):
    def test_spamClusterization(self):
        self.assertEqual(expected_result,
                         spamClusterization(requests, ids, threshold))


if __name__ == '__main__':
    unittest.main()
