class Solution {
    public double[] sampleStats(int[] count) {
        Map<Integer, Integer> map = new HashMap<>();
        double res[] = new double[5];
        for (int i = 0; i < count.length; i++) {
            int num = count[i];
            if (num == 0) {
                continue;
            } else {
                map.put(i, count[i]);
            }
        }
        double sum = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int maxFreq = Integer.MIN_VALUE;
        int mode = 0;
        int size = 0;
        for (int key : map.keySet()) {
            int freq = map.get(key);
            size += freq;
            min = Math.min(min, key);
            max = Math.max(max, key);
            if (freq > maxFreq) {
                maxFreq = freq;
                mode = key;
            }
             sum += key * (long) freq;
        }
        System.out.println(map);
        res[0] = min;
        res[1] = max;
        res[2] = sum / size;
        res[4] = mode;

        int countSum = 0;
        int median1 = -1, median2 = -1;

        for (int i = 0; i < count.length; i++) {
            countSum += count[i];
            if (countSum >= size / 2 && median1 == -1) {
                median1 = i;
            }
            if (countSum >= size / 2 + 1) {
                median2 = i;
                break;
            }
        }

        if (size % 2 == 0) {
            res[3] = (median1 + median2) / 2.0;
        } else {
            res[3] = median2;
        }
        return res;
    }
}