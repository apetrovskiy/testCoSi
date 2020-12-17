test_data = [
    ([1, 1, 1], 2, True),
]

@pytest.mark.parametrize("cap,volume,expected_result", test_data)
def test_running_water(cap: List[int], volume: int, expected_result: bool):
    assert expected_result == runningWater(cap, volume)
