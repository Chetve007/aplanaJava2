package task_5.operations;

public class Division {

    public double operation(double a, double b) {
        if (b == 0.0)
            throw new ArithmeticException("You cannot divide by 0");
        return a / b;
    }
}
