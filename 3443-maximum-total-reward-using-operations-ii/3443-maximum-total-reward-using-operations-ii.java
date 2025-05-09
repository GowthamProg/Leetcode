public class Solution {
    public int maxTotalReward(int[] rewards) {
        Set<Integer> set = new TreeSet<>();
        int max = Integer.MIN_VALUE;
        for (int r : rewards) {
            if (set.add(r)) {
                max = Math.max(r, max);
            }
        }

        boolean[] bitset = new boolean[2 * max];
        bitset[0] = true;

        for (int r : set) {
            for (int i = 0; i < r; i++) {
                if (bitset[i]) bitset[i + r] = bitset[i];
            }
        }

        for (int i = bitset.length - 1; i >= 0; i--) {
            if (bitset[i]) {
                return i;
            }
        }

        return 0;
    }
}