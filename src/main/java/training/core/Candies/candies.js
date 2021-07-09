function candies(n, m) {
    return m - m % n;
}

module.exports = { candies };