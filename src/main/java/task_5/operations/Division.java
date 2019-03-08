package task_5.operations;

public class Division {

    public double operation(double a, double b) {
//        if (b == 0.0)                                                     first version
//            throw new ArithmeticException("You cannot divide by 0");
//        return a / b;


        double res = 0;
        try {
            res = a / b;
            if (res == Double.POSITIVE_INFINITY || res == Double.NEGATIVE_INFINITY)
                throw new ArithmeticException();
        } catch (ArithmeticException e) {
            System.out.println("What are you doing? You can't divide by 0!");
        }
        return res;
    }
}
