package task_4.task_4_2;

public class Candy extends Sweets {

    private int calories;

    public Candy(String name, double weight, double price, int calories) {
        super(name, weight, price);
        this.calories = calories;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    @Override
    public String toString() {
        return "Candy {" + super.toString() + ", calories = " + calories + "}";
    }
}
