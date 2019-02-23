package task_4.task_4_1;

public class ArrayMinMaxTest {
    public static void main(String[] args) {

        ArrayMinMax arr = new ArrayMinMax();
        arr.fillArray();
        arr.displayArray();

        int maxNeg = arr.findMaxNeg();
        System.out.printf("Maximum negative number = %d\n", maxNeg);

        int minPos = arr.findMinPos();
        System.out.printf("Minimum positive number = %d\n", minPos);

        arr.swap();
        arr.displayArray();
    }
}
