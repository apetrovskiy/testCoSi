const { seatsInTheater } = require("./seats_in_theater");

describe.each([
    [16, 11, 5, 3, 96],
    [1, 1, 1, 1, 0],
    [13, 6, 8, 3, 18],
    [60, 100, 60, 1, 99],
    [1000, 1000, 1000, 1000, 0],
])(
    "candies(%o, %i) should equal %i",
    (nCols, nRows, col, row, expectedResult) => {
        test(`nCol = ${nCols}, nRows = ${nRows}, col = ${col}, row = ${row}, returns ${expectedResult}`, () => {
            expect(seatsInTheater(nCols, nRows, col, row)).toEqual(expectedResult);
        });
    }
);