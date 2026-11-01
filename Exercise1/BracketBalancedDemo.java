/**
 * Name Surname: Furkan Bozkurt
 * Date: 01.11.2026
 */
package Exercise1;

public class BracketBalancedDemo {
    public static void main(String[] args) {

        String[] expressions = {
                "[{()}]",
                "[()()]{}",
                "([]",
                "([{]})",
                "abc{defg(ijk)l[mn]op}qr",
                "a(bc)def]"
        };
        System.out.println("========== BALANCED BRACKET TEST ==========");
        // Test all expressions
        for (String expression : expressions) {
            boolean result = BalancedBrackets.isBalanced(expression);
            System.out.println(
                    "Input: " + expression + " -> Output: " + result
            );
        }
    }
}
