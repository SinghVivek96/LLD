package SOLID.InterfaceSegregationPrinciple.Solution;

public class Demo {
    public static void main(String args[]){
        Chef chef = new Chef();
        chef.cookFood();
        chef.manageInventory();

        Waiter waiter = new Waiter();
        waiter.serveFood();
        waiter.collectBills();
    }
}
