public class solution {
    public int divisorSubstrings(int n, int k) {
        return sumOfDivisors(n, k);
    }
    
    private int sumOfDivisors(int inputData, int groupLength) {
        int result = 0;
        if (0 == inputData) {
            return result;
        }
        List<Integer> divisors = getDivisorsToTry(inputData, groupLength);
        for (int i = 0; i < divisors.size(); i++) {
            
        }
        return result;
    }
    
    private List<Integer> getDivisorsToTry(int inputData, int groupLength) {
        final String inputString = String.valueOf(inputData);
        List<Integer> resultList = new ArrayList<>();
        for (int i = 0; i < inputString.length() - 1; i++) {
            System.out.println("input data " + inputData);
            System.out.println("iteration = " + i);
            System.out.println("gorup length = " + groupLength);
            System.out.println("substring = " + inputString.substring(i, groupLength));
            // resultList.add(Integer.valueOf(inputString.substring(i, groupLength)));
        }
        return resultList;
    }
}
