package task_4.task_4_2;

public class Marmalade extends Sweets {

    private String flavor;

    public Marmalade(String name, double weight, double price, String flavor) {
        super(name, weight, price);
        this.flavor = flavor;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    @Override
    public String toString() {
        return "Marmalade {" + super.toString() + ", flavor = '" + flavor + '\'' + '}';
    }
}
