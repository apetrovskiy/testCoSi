import pytest
from typing import List
from src.main.java.tpm.code002.code import camelCaseSeparation


test_data = [(["is", "valid", "right"], "isValid", True),
             (["is", "valid", "right"], "IsValid", True),
             (["is", "valid", "right"], "isValId", False),
             (["is", "valid", "right"], "IsValId", False),
             (["a"], "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", True),
             (["a"], "a", True),
             (["n"], "nNNNN", True),
             (["rmgeydubej"], "RmgeydubejRmgeydubejbgsozjgoRmgeydubej", False),
             (["nkflqwutfx", "ujornnkpx", "qazauyg", "ea", "xu"], "Ea", True),
             (["paxltbm", "hhbut", "ehqn", "odqetasf", "zt"], "lg", False),
             (["pleidgbik", "ohpq", "me", "jicgampant", "tjbtlf"],
              "TjbtlfTjbtlfPleidgbikJicgampantOhpq", True),
             (["jgpptd", "mbgqjuduu", "uh", "qfgmyn", "oj"],
              "cgptpsniUhUhwzillcclephb", False),
             (["ayrtu", "ceinm", "nbcyjsghf", "ukw", "in", "noiobkq",
               "eqlpggfocl", "cri", "ikgtzxc", "oll"], "InCeinm", True),
             (["owbygfnsl", "fssumxwoir", "gsdyhl", "cjlq", "eyfrhc", "q", "lqedpqdhn", "jczuhoky", "clwqad", "todmmk"], "Lqedpqdhnez", False), ]


@pytest.mark.parametrize("words,variable_name,expected_result", test_data)
def test_camel_case_separation(words: List[str], variable_name: str, expected_result: bool):
    assert expected_result == camelCaseSeparation(words, variable_name)
