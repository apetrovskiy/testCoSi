const { seatsInTheater } = require("./seats_in_theater");

describe.each([
    [16, 11, 5, 3, 96],
])(
    "candies(%o, %i) should equal %i",
    (nCols, nRows, col, row, expectedResult) => {
        test(`nCol = ${nCols}, nRows = ${nRows}, col = ${col}, row = ${row}, returns ${expectedResult}`, () => {
            expect(seatsInTheater(nCols, nRows, col, row)).toEqual(expectedResult);
        });
    }
);