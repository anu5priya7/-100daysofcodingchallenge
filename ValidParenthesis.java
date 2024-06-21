Input: s = "()"
Output: true
Example 2:

Input: s = "()[]{}"
Output: true
Example 3:

Input: s = "(]"
Output: false

    
import java.util.Stack;

public class ValidParenthesis {
    public static class Parenthesis {

        public boolean isValid(String s) {
            Stack<Character> st = new Stack<>();

            for (int i = 0; i < s.length(); i++) {
                char currentChar = s.charAt(i);
                if (currentChar == '(' || currentChar == '{' || currentChar == '[') {
                    st.push(currentChar);
                } else if (currentChar == ')') {
                    if (st.isEmpty() || st.peek() != '(') {
                        return false;
                    } else {
                        st.pop();
                    }
                } else if (currentChar == '}') {
                    if (st.isEmpty() || st.peek() != '{') {
                        return false;
                    } else {
                        st.pop();
                    }
                } else if (currentChar == ']') {
                    if (st.isEmpty() || st.peek() != '[') {
                        return false;
                    } else {
                        st.pop();
                    }
                }
            }

            return st.isEmpty();
        }
    }

    public static void main(String[] args) {
        Parenthesis vp = new Parenthesis();
        String s = "()[]}";
        boolean result = vp.isValid(s);
        System.out.println("Is the string \"" + s + "\" valid? " + result);
    }
}


Time Complexity: O(n) - The method processes each character in the string exactly once, where n is the length of the string.

Space Complexity: O(n) - In the worst case, the stack will contain all opening brackets if there are no closing brackets, requiring space proportional to the length of the string.
