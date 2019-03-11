package task_5;

import task_5.operations.Addition;
import task_5.operations.Division;
import task_5.operations.Multiplication;
import task_5.operations.Subtraction;

import java.util.Scanner;

public class IOclass {

    private Scanner scanner;
    private double a;
    private double b;
    private char op;

    public IOclass() {
        this.scanner = new Scanner(System.in);
        System.out.println("Hi, it's simple calculating program.");
    }

    public void setFirstNumber() {
        System.out.println("Please, enter you first number: ");
        a = scanner.nextDouble();
    }

    public void setSecondNumber() {
        System.out.println("Please, enter you second number: ");
        b = scanner.nextDouble();
    }

    public void setOperator() {
        System.out.println("Please, enter the operator (we are supporting: '+-*/'): ");
        op = scanner.next().trim().charAt(0);
    }

    public void showResult() {
        try {
            double res = calculate();
            System.out.printf("RESULT: %s %c %s = %.2f\n", a, op, b, res);
        } catch (ArithmeticException e) {
            System.out.println("You cannot divide by 0");
            e.printStackTrace();
        }
    }

    private double calculate() {
        switch (op) {
            case '+':
                return new Addition().operation(a, b);
            case '-':
                return new Subtraction().operation(a, b);
            case '/':
                return new Division().operation(a, b);
            case '*':
                return new Multiplication().operation(a, b);
            default:
                throw new RuntimeException("Not supported operation or you don't enter the operator");
        }
    }
}