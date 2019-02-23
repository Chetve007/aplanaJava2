package task_4.task_4_2;

public class IceCream extends Sweets {

    private String form;

    public IceCream(String name, double weight, double price, String form) {
        super(name, weight, price);
        this.form = form;
    }

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }

    @Override
    public String toString() {
        return "IceCream {" + super.toString() + ", form = '" + form + '\'' + '}';
    }
}
