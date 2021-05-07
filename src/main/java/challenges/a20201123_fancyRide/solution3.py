CARS = {1: "UberX", 2: "UberXL", 3: "UberPlus", 4: "UberBlack", 5: "UberSUV"}
AMOUNT = 20


def fancyRide(l1, fares):
    candidates = [fare for fare in fares if fare * l1 <= AMOUNT]
    return CARS[len(candidates)]
