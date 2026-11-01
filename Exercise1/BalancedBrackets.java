/**
 * Name Surname: Furkan Bozkurt
 * Date: 01.11.2026
 */
package Exercise1;

public class BalancedBrackets {
    public static boolean isBalanced(String s) {

        BracketStack stack = new BracketStack();

        // Check every character
        for (int i = 0; i < s.length(); i++) {

            char current = s.charAt(i);
            // Add opening brackets to the stack
            if (current == '(' || current == '[' || current == '{') {

                stack.push(current);
            }
            // Check closing brackets
            else if (current == ')' || current == ']' || current == '}') {

                if (stack.isEmpty()) {
                    return false;
                }
                char opening = stack.pop();
                if (!isMatchingPair(opening, current)) {
                    return false;
                }
            }
        }
        // Stack must be empty at the end
        return stack.isEmpty();
    }
    private static boolean isMatchingPair(char opening, char closing) {
        if (opening == '(' && closing == ')') {
            return true;
        }
        if (opening == '[' && closing == ']') {
            return true;
        }
        if (opening == '{' && closing == '}') {
            return true;
        }
        return false;
    }
}
