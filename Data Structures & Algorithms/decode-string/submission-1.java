
class Solution {

    public String decodeString(String s) {

        Stack<Integer> num = new Stack<>();
        Stack<Character> string = new Stack<>();

        int number = 0;

        for (int i = 0; i < s.length(); i++) {

            if (Character.isDigit(s.charAt(i))) {

                number = number * 10 + (s.charAt(i) - '0');
            }

            else if (s.charAt(i) == '[') {

                num.push(number);
                number = 0;

                string.push(s.charAt(i));
            }

            else if (s.charAt(i) == ']') {

                String temp = "";

                while (string.peek() != '[') {
                    temp = string.pop() + temp;
                }

                string.pop();

                int a = num.pop();

                while (a > 0) {

                    for (int j = 0; j < temp.length(); j++) {
                        string.push(temp.charAt(j));
                    }

                    a--;
                }
            }

            else {

                string.push(s.charAt(i));
            }
        }

        String ans = "";

        while (!string.isEmpty()) {
            ans = string.pop() + ans;
        }

        return ans;
    }
}