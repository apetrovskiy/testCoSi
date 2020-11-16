int spiderMove(int x, int y) {

  x = std::abs(x);
  y = std::abs(y);

  std::vector<int> n(x + 1);
  for(int i = 0; i < x + 1; i++) {
    n[i] = 1;
  }

  for (int i = 0; i < y; i++) {
    for (int j = 1; j < x + 1; j++) {
      n[j] = n[j - 1] + n[j];
    }
  }
  return ...;
}
