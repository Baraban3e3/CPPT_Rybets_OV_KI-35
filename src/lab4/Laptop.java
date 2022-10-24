package lab4;

import lab3.Keyboard;
import lab3.Monitor;
import lab3.Mouse;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Laptop extends ComputerAbstract implements BatteryPower {
    boolean power;

    public Laptop(){
        super();
    }

    public boolean isPower() {
        return power;
    }

    public void setPower(boolean power) {
        this.power = power;
    }

    public void AttachMouse(){
        if(!m_mouse.isMo_state()){
            m_mouse.setMo_state(true);

            fout.println("New state of mouse: " + m_mouse.isMo_state());
            System.out.println("Mouse connected!!!");
        }
        else{
            System.out.println("The mouse is already attached!");
        }
    }

    public void RemoveMouse(){
        if(m_mouse.isMo_state()){
            m_mouse.setMo_state(false);

            fout.println("New state of mouse: " + m_mouse.isMo_state());
            System.out.println("Mouse removed!!!");
        }
        else{
            System.out.println("The mouse is already removed!");
        }
    }

    public void stateOfPower() {
        if(power){
        System.out.println("Laptop is connected to chain");
        }
         else if(!power) {
            System.out.println("Laptop is disconnected from chain");
        }
    }

    @Override
    public void turnOnLaptop() {
        System.out.println("The laptop is turned on");
    }
}