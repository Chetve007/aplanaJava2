package task_4.task_4_1;

import java.util.Arrays;

public class ArrayMinMax {

    private int minPos;
    private int maxNeg;
    private int[] array = new int[20];
    private int maxNegInd;
    private int minPosInd;

    public void fillArray() {
        for (int i = 0; i < array.length; i++) {
            int rand = (int)(Math.random() * (array.length+1)) - 10;
            array[i] = rand;
        }
    }

    public void displayArray() {
        System.out.println(Arrays.toString(array));
    }

    public int findMaxNeg() {
        maxNeg = array[0];
        for (int i = 1; i < array.length; i++) {
            if (maxNeg > array[i]) {
                maxNeg = array[i];
                maxNegInd = i;
            }
        }
        if (maxNeg > 0)
            throw new RuntimeException("There are no negative numbers in the array");
        else
            return maxNeg;
    }

    public int findMinPos() {
        minPos = array[0];
        for (int i = 0; i < array.length-1; i++) {
            if (minPos > 0) {
                if (minPos > array[i+1] && array[i+1] > 0) {
                    minPos = array[i+1];
                    minPosInd = i+1;
                }
            }
            else {
                minPos = array[i+1];
                minPosInd = i+1;
            }
        }
        if (minPos > 0)
            return minPos;
        else
            throw new RuntimeException("There are no positive numbers in the array");
    }

    public void swap() {
        array[maxNegInd] = minPos;
        array[minPosInd] = maxNeg;
    }
}
