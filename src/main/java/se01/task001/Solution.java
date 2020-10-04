int spiderMove(int x, int y) {

    x = Math.abs(x);
    y = Math.abs(y);
  
    int[] n = new int[x + 1];
    for (int i = 0; i < x + 1; i++) {
      n[i] = 1;
    }
  
    for (int i = 0; i < y; i++) {
      for (int j = 1; j < x + 1; j++) {
        n[j] = n[j - 1] + n[j];
      }
    }
    class Calc {
      public int onZeroNmberOfSteps(int xCoord, int yCoord) {
              if (0 == xCoord && 0 == yCoord) {
                  return 1;
              } else if (0 == xCoord) {
                  return 1;
              } else if (0 == yCoord) {
                  return 1;
              }
              var xFact = IntStream.rangeClosed(2, xCoord).reduce((int a, int b) -> a * b);
              var yFact = IntStream.rangeClosed(2, yCoord).reduce((int a, int b) -> a * b);
              var common = IntStream.rangeClosed(2, xCoord + yCoord).reduce((int a, int b) -> a * b);
              // return xFact.getAsInt() + yFact.getAsInt();
              return common.getAsInt();
      }
    }
    
    return new Calc().onZeroNmberOfSteps(x, y);
  }
  