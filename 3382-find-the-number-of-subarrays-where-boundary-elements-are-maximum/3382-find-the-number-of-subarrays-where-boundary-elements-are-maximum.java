class Solution {
    public long numberOfSubarrays(int[] a) {
        long ans = 0;
        Stack<Integer> st = new Stack<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int j = 0; j < a.length; ans += map.get(a[j]), st.push(j++)) {
            for (int idx; !st.isEmpty() && a[j] >= a[idx = st.peek()]; st.pop())
                if (a[j] > a[idx]) map.remove(a[idx]);
            map.put(a[j], map.getOrDefault(a[j], 0) + 1);
        }
        return ans;
    }
}