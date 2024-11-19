class Solution {
    int solve(int start, int end, String str, int k) {
        int res = 0;
        for (int uc = 1; uc <= 26 && uc * k <= end - start + 1; uc++) {
            int wl = uc * k;
            int count = 0;
            int i = start;
            int[] arr = new int[26];
            for (int j = start; j <= end; j++) {
                arr[str.charAt(j) - 'a']++;
                if (arr[str.charAt(j) - 'a'] == k)
                    count++;
                else if (arr[str.charAt(j) - 'a'] == k + 1)
                    count--;
                if (j - i + 1 > wl) {
                    if (arr[str.charAt(i) - 'a'] == k)
                        count--;
                    else if (arr[str.charAt(i) - 'a'] == k + 1)
                        count++;
                    arr[str.charAt(i) - 'a']--;
                    i++;
                }
                if (count == uc)
                    res++;
            }
        }
        return res;
    }

    public int countCompleteSubstrings(String word, int k) {
        int n = word.length();
        int last = 0;
        int result = 0;
        for (int i = 1; i <= n; i++) {
            if (i == n || Math.abs(word.charAt(i) - word.charAt(i - 1)) > 2) {
                result += solve(last, i - 1, word, k);
                last = i;
            }
        }
        return result;
    }
}