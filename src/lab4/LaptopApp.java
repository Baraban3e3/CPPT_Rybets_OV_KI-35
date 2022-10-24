package lab4;

public class LaptopApp {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        laptop.turnOnLaptop();
        laptop.setPower(true);
        laptop.stateOfPower();
        laptop.RemoveMouse();
        laptop.AttachMouse();
    }
}
