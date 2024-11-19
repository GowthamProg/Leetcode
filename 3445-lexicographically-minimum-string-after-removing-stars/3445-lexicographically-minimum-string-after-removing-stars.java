class Solution {
    public String clearStars(String str) {
        char a[] = str.toCharArray();
        Stack<Integer>[] s = new Stack[26];
        for(int i=0;i<26;i++) s[i] = new Stack<>();
        for(int i=0;i<a.length;i++) {
            if(a[i] == '*') {
                for(int j=0;j<26;j++) {
                    if(!s[j].isEmpty()) {
                        int index = s[j].pop();
                        a[index] = '*';
                        break;
                    }
                }
            }else{
                s[a[i]-'a'].push(i);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(char ch : a) if(ch !='*') sb.append(ch);
        return sb.toString();
    }
}