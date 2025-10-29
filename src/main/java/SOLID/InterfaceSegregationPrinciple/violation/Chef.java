package SOLID.InterfaceSegregationPrinciple.violation;

public class Chef implements RestaurantEmployee{

    @Override
    public void serveFood() {
        //Not my task
    }

    @Override
    public void cleanDishes() {
        //Not my task
    }

    @Override
    public void cookFood() {
        //Logic to cook food
    }

    @Override
    public void manageTables() {
        //Not my task
    }
}
