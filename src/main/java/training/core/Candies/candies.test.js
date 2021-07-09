const { candies } = require("./candies");

describe.each([
    [
        3, 10, 9
    ],
    [1, 2, 2],
    [10, 5, 0],
    [4, 4, 4],
    [4, 15, 12],
    [9, 100, 99],
    [8, 2, 0],
    [3, 3, 3],
    [7, 10, 7],
    [3, 23, 21],
])(
    "candies(%o, %i) should equal %i",
    (children, pieces, expectedResult) => {
        test(`children = ${children}, pieces = ${pieces}, returns ${expectedResult}`, () => {
            expect(candies(children, pieces)).toEqual(expectedResult);
        });
    }
);