class Solution {
    public String[] findWords(final String[] words) {
        final List<String> list = new ArrayList<>();
        final int[] characters = new int[] {
            2, 3, 3, 2, 1, 2, 2, 2, 1, 2, 2, 2, 3, 3, 1, 1, 1, 1, 2, 1, 1, 3, 1, 3, 1, 3
        };

        for(final String word : words) {
            int i = 1;

            while(i < word.length() && characters[getIdx(word.charAt(i - 1))] == characters[getIdx(word.charAt(i))])
                ++i;

            if(i == word.length())
                list.add(word);
        }

        final String[] result = new String[list.size()];

        for(int i = 0; i < result.length; ++i)
            result[i] = list.get(i);

        return result;
    }

    private int getIdx(final int c) {
        return c - (c >= 'A' && c <= 'Z' ? 'A' : 'a');
    }
}