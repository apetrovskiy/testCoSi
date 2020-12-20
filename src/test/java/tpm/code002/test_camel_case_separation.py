import pytest
from typing import List
from src.main.java.tpm.code002.code import camelCaseSeparation


test_data = [(["is", "valid", "right"], "isValid", True),
             (["is", "valid", "right"], "IsValid", True),
             (["is", "valid", "right"], "isValId", False), ]


@pytest.mark.parametrize("words,variable_name,expected_result", test_data)
def test_camel_case_separation(words: List[str], variable_name: str, expected_result: bool):
    assert expected_result == camelCaseSeparation(words, variable_name)
