package task_3;

import java.util.Scanner;

public class Program {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Choose the program (1 or 2):");

        switch (scanner.nextInt()) {
            case 1:
                calculate();
                break;
            case 2:
                stringsArray();
                break;
            default:
                throw new RuntimeException("You must choose the first or second program");
        }
    }

    public static void calculate() {
        System.out.println("Enter the first decimal number:");
        double first = scanner.nextDouble();
        System.out.println("Enter the operator:");
        char operator = scanner.next().charAt(0);
        System.out.println("Enter the second decimal number:");
        double second = scanner.nextDouble();
        double result;
        switch (operator) {
            case '+':
                result = first + second;
                break;
            case '-':
                result = first - second;
                break;
            case '*':
                result = first * second;
                break;
            case '/':
                result = first / second;
                break;
            default:
                throw new RuntimeException("Not supported operation");
        }
        System.out.printf("Result is %.4f", result);
        scanner.close();
    }

    public static void stringsArray() {
        System.out.println("Enter word count");
        int count = scanner.nextInt();
        if (count <= 0) throw new RuntimeException("The number of words in the array must be greater than 0");
        String[] arrayStr = new String[count];
        for (int i = 0; i < count; i++){
            System.out.println("Enter the word");
            arrayStr[i] = scanner.next().trim();
        }
        String max = arrayStr[0];
        for (int i = 1; i < count; i++) {
            if (arrayStr[i].length() > max.length())
                max = arrayStr[i];
        }
        System.err.printf("The longest word in the array is '%s'", max);
        scanner.close();
    }
}
