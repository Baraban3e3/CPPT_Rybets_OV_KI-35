package lab3;

import java.io.*;

public class ComputerApp {
    public static void main(String[] args) throws FileNotFoundException {
        Computer computer = new Computer();
        computer.AttachKeyboard();
        computer.AttachMonitor();
        computer.printConnectionOfDevices();
        System.out.println("\n");
        computer.RemoveMonitor();
        computer.printConnectionOfMonitor();
        System.out.println("\n");
        computer.AttachMouse();
        computer.printConnectionOfDevices();
        System.out.println("\n");
        computer.RemoveKeyboard();
        computer.printConnectionOfKeyboard();
        computer.disclose();
    }
}

