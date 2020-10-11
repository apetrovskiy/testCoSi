import unittest
from ex001 import add


class Ex001Test(unittest.TestCase):
    def test_ex001(self):
        self.assertEqual(add(1, 2), 3)


if __name__ == '__main__':
    unittest.main()
