class Code {
    public static void main() {
        Console.Writeline(addTwoDigits(29));
    }
    static int addTwoDigits(int n) {
        if (10 > n || n > 99)
            return 0;
        
        // return Enumerable.Range(0, 1)
        //     .Select(index => (int) ((int) (inputValue / Math.pow(10.0, index)) - ((int) (inputValue / Math.pow(10.0, index + 1))) * 10))
        //     .Sum();
        // return Enumerable.Range(0, 1)
        //     .Select(index => (int) ((n / 10 ^ index) - (n / 10 ^ (index + 1)) * 10))
        //     .Sum();
        return n % 10 + (n - (n % 10)) / 10;
    }
}
