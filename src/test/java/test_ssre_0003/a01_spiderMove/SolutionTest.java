package test_ssre_0003.a01_spiderMove;

public class SolutionTest {
    @ParameterizedTest
    @MethodSource("getInputData")
    void test(int x, int y, int expectedResult) {
        val actualResult = new Solution().spiderMove(x,y);
        
    }
}
