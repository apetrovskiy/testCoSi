def spiderMove(x, y):
    if x == 0 or y == 0:
        return 1
    m = d = 1
    for current_x in range(1, abs(x) + 1):
        m *= current_x + abs(y)
        d *= current_x
    return m / d
