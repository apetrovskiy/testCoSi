import unittest
from unittest import TestCase
from src.main.java.test_lea_0003.a01_evenDigitsNumber.solution import even_digits_number


class EvenDigitsNumberTest(TestCase):
    def test_even_digits_number(self):
        self.assertEqual(3, even_digits_number([12, 134, 111, 1111, 10]))


if __name__ == '__main__':
    unittest.main()
