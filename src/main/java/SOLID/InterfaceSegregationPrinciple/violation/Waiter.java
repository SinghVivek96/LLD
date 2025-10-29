package SOLID.InterfaceSegregationPrinciple.violation;

public class Waiter implements RestaurantEmployee{

    @Override
    public void serveFood() {
        //Logic to serve food
    }

    @Override
    public void cleanDishes() {
        //NOt my task
    }

    @Override
    public void cookFood() {
        //Not my task
    }

    @Override
    public void manageTables() {
        //Not my task
    }
}
