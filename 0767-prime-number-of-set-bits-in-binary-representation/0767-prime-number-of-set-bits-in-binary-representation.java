class Solution {
    private final int[] primes = new int[]{2, 3, 5, 7, 11, 13, 17, 19};
    private int cnk(int n, int k) {
        if (n <= 0 || k <= 0) {
            return 0;
        }
        long f1 = 1;
        for (int i = k + 1; i <= n; i++) {
            f1 *= i;
        }
        long f2 = 1;
        for (int i = 2; i <= n - k; i++) {
            f2 *= i;
        }
        return (int) (f1 / f2);
    }
    private int primeBitNumbersCount(int length, int minus) {
        int result = 0;
        for (int i = 0; i < primes.length && primes[i] - minus <= length; i++) {
            result += cnk(length, primes[i] - minus);
        }
        return result;
    }
    private int primesTo(int number) {
        for (int i = primes.length - 1; i >= 0; i--) {
            if (number >= primes[i]) {
                return i + 1;
            }
        }
        return 0;
    }
    private int primeBitNumbersCount(int number) {
        int pointer = 0x40000000;
        int position = 31;
        int bitsSet = 0;
        int primeBitNumbersCount = 0;  

        while (pointer != 0) {
            if ((number & pointer) > 0) {
                primeBitNumbersCount += primeBitNumbersCount(position - 1, bitsSet);
                bitsSet++;
            }
            pointer >>>= 1;
            position--;
        }
        primeBitNumbersCount += primesTo(bitsSet);
        return primeBitNumbersCount;
    }
    public int countPrimeSetBits(int left, int right) {
        return primeBitNumbersCount(right) - primeBitNumbersCount(left - 1);
    }
}