/**
 * Name Surname: Furkan Bozkurt
 * Date: 01.11.2026
 */
package Exercise2;

public class ReverseEquationDemo {
    public static void main(String[] args) {
        String[] equations = {
                "20-3+5*2",
                "5+2*56-2/4",
                "123+45*6",
                "100/25-7"
        };
        // Test all equations
        for (String equation : equations) {

            String result = EquationReverser.reverseEquation(equation);

            System.out.println("Input:  " + equation);
            System.out.println("Output: " + result);
            System.out.println();
        }
    }
}
