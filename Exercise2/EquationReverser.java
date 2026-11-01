/**
 * Name Surname: Furkan Bozkurt
 * Date: 01.11.2026
 */
package Exercise2;

public class EquationReverser {
    public static String reverseEquation(String equation) {
        TokenStack stack = new TokenStack();
        int i = 0;

        // Read the equation from left to right
        while (i < equation.length()) {

            char current = equation.charAt(i);

            // If the character is a digit
            if (Character.isDigit(current)) {
                int start = i;
                // Find the end of the number
                while (i < equation.length()
                        && Character.isDigit(equation.charAt(i))) {
                    i++;
                }
                String number = equation.substring(start, i);

                // Add the whole number to the stack
                stack.push(number);
            }
            else {

                // Add the operator to the stack
                stack.push(String.valueOf(current));
                i++;
            }
        }
        StringBuilder result = new StringBuilder();
        // Take all items from the stack
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }
        return result.toString();
    }
}
