class Solution {

    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> map =
                new HashMap<>();

        for (String s : strs) {

            String key = getfreq(s);

            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }

            map.get(key).add(s);
        }

        return new ArrayList<>(map.values());
    }

    public String getfreq(String s) {

        char[] arr = s.toCharArray();

        Arrays.sort(arr);

        return new String(arr);
    }
}