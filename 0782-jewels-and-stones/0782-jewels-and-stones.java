class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        Map<Character, Integer> jewel = toCharIntMap(jewels);
        Map<Character, Integer> stone = toCharIntMap(stones);
        int count = 0;
        for(var x: jewel.entrySet()){
            count += stone.getOrDefault(x.getKey(),0);
        }
        return count;
    }
    public static Map<Character, Integer> toCharIntMap(String str) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        return map;
    }
}