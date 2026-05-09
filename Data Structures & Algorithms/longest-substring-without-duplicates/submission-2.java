
class Solution {

    public int lengthOfLongestSubstring(String s) {

        HashSet<Character> set = new HashSet<>();

        int count = 0;
        int currcount = 0;
        int start = 0;

        for (int i = 0; i < s.length(); i++) {

            while (set.contains(s.charAt(i))) {
                set.remove(s.charAt(start));
                start++;
                currcount--;
            }

            set.add(s.charAt(i));
            currcount++;

            count = Math.max(count, currcount);
        }

        return count;
    }
}