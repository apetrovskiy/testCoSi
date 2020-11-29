CARS = ["UberX", "UberXL", "UberPlus", "UberBlack", "UberSUV"]
AMOUNT = 20

def fancyRide(l, fares):
    candidates = [x if fare * l <= AMOUNT for x in fares]
    print(candidates)
