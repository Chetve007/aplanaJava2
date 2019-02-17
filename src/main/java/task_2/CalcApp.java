package task_2;

import java.util.Scanner;

/**
 * @author Aleksey
 */

/**
 * Class for mathematical operations with two decimal numbers (calculator)
 */
public class CalcApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first decimal number:");
        double first = scanner.nextDouble();
        System.out.println("Enter the operator:");
        char operator = scanner.next().charAt(0);
        System.out.println("Enter the second decimal number:");
        double second = scanner.nextDouble();

        double res = mathOperation(first, operator, second);

        formattedDisplay(res, 4);
    }

    /**
     *
     * @param x is first decimal number
     * @param operator support only '+', '-', '*', '/'
     * @param y is second decimal number
     * @return the result as a decimal number
     */
    public static double mathOperation(double x, char operator, double y) {
        switch (operator) {
            case '+':
                return x + y;
            case '-':
                return x - y;
            case '*':
                return x * y;
            case '/':
                return x / y;
            default:
                throw new RuntimeException("Not supported operation");
        }
    }

    /**
     *
     * @param res is a decimal number which should be displayed in formatted form
     * @param decimalPlaces a number of simbols after comma
     */
    public static void formattedDisplay(double res, int decimalPlaces) {
        System.out.printf("Result is %." + decimalPlaces + "f", res);
    }
}
