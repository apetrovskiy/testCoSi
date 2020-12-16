from src.main.java.test_lea_0005.practice.algo.a03_mergeStrings.solution3 import mergeStrings
import pytest


@pytest.mark.parametrize(
    "first_string,second_string,expected_result",
    [
        ("dce", "cccbd", "dcecccbd"),
        ("super", "tower", "stouperwer"),
        ("a", "z", "az"),
        ("uchlmfelno", "gr", "gruchlmfelno"),
        ("kkihj", "jbsmfoftph", "jbsmfoftphkkihj"),
        ("enbvszyppzyiydnc", "ousswsbeljamma", "eounbvszsswsbeljammayppzyiydnc"),
        ("vbpvxohmfudekrniglpym", "wyzjgnituhfhyxkfpnccqjhrvf",
         "wvbpvxohmfudekrniglpymyzjgnituhfhyxkfpnccqjhrvf"),
        ("fpniswlxslcjgaau", "txwqqryebhjrjwkgx",
         "fpnitswlxslcjgaauxwqqryebhjrjwkgx"),
        ("z", "a", "az"),
        ("ougtaleegvrabhugzyx", "wvieaqgaegbxg",
         "owvieaqugtaleegvrabhugzyxgaegbxg"),
    ],
)
def test_merge_strings(first_string: str, second_string: str, expected_result: str):
    assert expected_result == mergeStrings(first_string, second_string)


'''
Test 1
Input:
s1: "dce"
s2: "cccbd"
Output:
""
Expected Output:
"dcecccbd"

Test 2
Input:
s1: "super"
s2: "tower"
Output:
""
Expected Output:
"stouperwer"

Test 3
Input:
s1: "a"
s2: "z"
Output:
""
Expected Output:
"az"

Test 4
Input:
s1: "uchlmfelno"
s2: "gr"
Output:
""
Expected Output:
"gruchlmfelno"

Test 5
Input:
s1: "kkihj"
s2: "jbsmfoftph"
Output:
""
Expected Output:
"jbsmfoftphkkihj"

Test 6
Input:
s1: "enbvszyppzyiydnc"
s2: "ousswsbeljamma"
Output:
""
Expected Output:
"eounbvszsswsbeljammayppzyiydnc"

Test 7
Input:
s1: "vbpvxohmfudekrniglpym"
s2: "wyzjgnituhfhyxkfpnccqjhrvf"
Output:
""
Expected Output:
"wvbpvxohmfudekrniglpymyzjgnituhfhyxkfpnccqjhrvf"

Test 8
Input:
s1: "fpniswlxslcjgaau"
s2: "txwqqryebhjrjwkgx"
Output:
""
Expected Output:
"fpnitswlxslcjgaauxwqqryebhjrjwkgx"

Test 9
Input:
s1: "z"
s2: "a"
Output:
""
Expected Output:
"az"

Test 10
Input:
s1: "ougtaleegvrabhugzyx"
s2: "wvieaqgaegbxg"
Output:
""
Expected Output:
"owvieaqugtaleegvrabhugzyxgaegbxg"
'''
