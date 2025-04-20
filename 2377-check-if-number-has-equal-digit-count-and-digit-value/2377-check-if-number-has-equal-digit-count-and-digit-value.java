class Solution {
    public boolean digitCount(String nm) {
        HashMap<Integer, Integer> map = new HashMap<>();
        char[] n = nm.toCharArray();
        int len = nm.length();
        for (int i = 0; i < len; i++) {
            int digit = n[i] - '0';
            map.put(digit, map.getOrDefault(digit, 0) + 1);
        }

        for (int i = 0; i < len; i++) {
            int expected = n[i] - '0';      
            int actual = map.getOrDefault(i, 0);
            if (expected != actual)
                return false;
        }

        return true;
    }
}
