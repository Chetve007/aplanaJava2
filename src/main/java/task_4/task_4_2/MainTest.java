package task_4.task_4_2;

public class MainTest {
    public static void main(String[] args) {

        Sweets candy = new Candy("Alenka", 12.2,2.65, 45);
        Sweets marmalade = new Marmalade("Marma", 5.1, 7.9, "Lemon");
        Sweets iceCream = new IceCream("IceBaby", 2.22, 16.91, "Ball");
        Sweets cake = new Cake("Yummy", 15.87, 6.66, true);

        double sumPrice = 0;
        double sumWeight = 0;

        final Sweets[] sweetArr = {candy, marmalade, iceCream, cake};

        for (Sweets swee : sweetArr) {
            sumPrice += swee.getPrice();
            sumWeight += swee.getWeight();
            System.out.println(swee.toString());
        }
        System.out.printf("Total price of sweets = %.2f\n", sumPrice);
        System.out.printf("Total weight of sweets = %.2f\n", sumWeight);
    }
}
