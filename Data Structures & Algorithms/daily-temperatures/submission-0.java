class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            int count = 0;

            for (int j = i + 1; j < n; j++) {
                count++;
                if (temperatures[j] > temperatures[i]) {
                    result[i] = count;
                    break;
                }
            }
        }

        return result;
    }
}