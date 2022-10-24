package lab7;

public class ShipHpldApp {
    public static void main(String[] args) {
        ShipHold shipHold = new ShipHold();
        shipHold.add(new Fuel(300, "Fuel1"));
        shipHold.add(new FoodSupplies(10, "Food1"));
        shipHold.add(new Fuel(200, "Fuel2"));
        shipHold.add(new FoodSupplies(100, "Food2"));
        shipHold.add(new Fuel(900, "Fuel3"));
        shipHold.add(new FoodSupplies(800, "Food3"));

        System.out.println(shipHold.get(0).getName());
        System.out.println(shipHold.get(1).getName());
        System.out.println(shipHold.get(2).getName());
        System.out.println(shipHold.get(3).getName());
        System.out.println(shipHold.get(4).getName());
        System.out.println(shipHold.getBasketWithMaxWeight().getName());
        System.out.println(shipHold.getTotalWeight());

    }
}
