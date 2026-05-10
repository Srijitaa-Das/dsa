class Solution {

    public int compress(char[] chars) {

        ArrayList<Character> res = new ArrayList<>();

        int st = 0;
        int end = st + 1;

        int count = 1;

        while (end < chars.length) {

            if (chars[st] == chars[end]) {
                count++;
            }

            else {

                res.add(chars[st]);

                if (count > 1) {

                    String s = Integer.toString(count);

                    for (int i = 0; i < s.length(); i++) {
                        res.add(s.charAt(i));
                    }
                }

                st = end;
                count = 1;
            }

            end++;
        }

        // last group
        res.add(chars[st]);

        if (count > 1) {

            String s = Integer.toString(count);

            for (int i = 0; i < s.length(); i++) {
                res.add(s.charAt(i));
            }
        }

        for (int i = 0; i < res.size(); i++) {
            chars[i] = res.get(i);
        }

        return res.size();
    }
}