def spiderMove(x, y):
    if x == 0 or y == 0:
        return 1
    m = d = 1
    for xval in range(1, abs(x) + 1):
        m *= (xval + abs(y))
        d *= xval
    return m /d
