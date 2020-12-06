CARS = {1: "UberX", 2: "UberXL", 3: "UberPlus", 4: "UberBlack", 5: "UberSUV"}
AMOUNT = 20

def fancyRide(l, fares):
    candidates = [fare for fare in fares if fare * l <= AMOUNT]
    return CARS[len(candidates)]
