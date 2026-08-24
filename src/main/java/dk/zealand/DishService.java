package dk.zealand;

public class DishService {
    private final Dish[] dishes = {
            new Dish("Festivalburger", 59),
            new Dish("Sprøde fritter", 35),
            new Dish("Vegansk bowl", 65),
            new Dish("Fantastiske Tyr", 89)
    };

    public void showDishes() {
        System.out.println("Retter:");
        for (int i = 0; i < dishes.length; i++) {
            System.out.printf("%d. %s – %d kr.%n", i + 1, dishes[i].getName(), dishes[i].getPrice());
        }
    }
}
