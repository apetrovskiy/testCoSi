namespace test_lea_0003.a01_evenDigitsNumber
{
    using System.Linq;

    public class EvenDigitsNumber
    {
        public int evenDigitsNumber(int[] a)
        {
            return Enumerable.Range(0, a.Length)
                .Select(index => isEven(a[index]))
                .Sum();
        }

        private int isEven(int element)
        {
            if (element < 10 || element >= 100 && element <= 1000)
                return 0;
            if (element < 100 || element >= 1000 && element <= 10000)
                return 1;
            return 0;
        }
    }
}