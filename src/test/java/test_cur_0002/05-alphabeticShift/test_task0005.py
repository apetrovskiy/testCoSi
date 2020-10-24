from unittest import TestCase

from src.main.java.test_cur_0002.a05alphabeticShift.solution import alphabeticShift


class Task0005Test(TestCase):
    def test_task0005(self):
        assert "dsbaz" == alphabeticShift("crazy")
