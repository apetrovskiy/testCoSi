func addTwoDigits(n int) int {
    if (10 > n || 99 < n) {
        return 0;
    }

    return n % 10 + ((n - (n % 10)) / 10);
}
