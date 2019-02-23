package task_4.task_4_2;

public class Cake extends Sweets {

    private boolean glaze;

    public Cake(String name, double weight, double price, boolean glaze) {
        super(name, weight, price);
        this.glaze = glaze;
    }

    public boolean isGlaze() {
        return glaze;
    }

    public void setGlaze(boolean glaze) {
        this.glaze = glaze;
    }

    @Override
    public String toString() {
        return "Cake {" + super.toString() + ", glaze = " + glaze + '}';
    }
}