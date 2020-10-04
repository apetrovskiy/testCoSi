int addTwoDigits(int n) {
    if (10 > n || n > 99)
        return 0;
    Console.WriteLine(n / 10);
    Console.WriteLine(n - n / 10 * 10);
    return n / 10 + (n - n / 10 * 10);
}
