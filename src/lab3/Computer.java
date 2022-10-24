package lab3;

import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Computer {
   private Mouse m_mouse;
   private Keyboard k_keybord;
   private Monitor m_monitor;
    private PrintWriter fout;

    public Computer(Mouse m_mouse, Keyboard k_keybord, Monitor m_monitor) throws FileNotFoundException {
        m_mouse = new Mouse();
        m_monitor =new Monitor();
        k_keybord = new Keyboard();
        fout = new PrintWriter(new File("Log.txt"));
    }

    public Computer() throws FileNotFoundException {
        m_mouse = new Mouse();
        m_monitor =new Monitor();
        k_keybord = new Keyboard();

        fout = new PrintWriter(new File("Log.txt"));
    }
    public void disclose(){
        fout.close();
    }
    public void printConnectionOfDevices(){
        System.out.println("Current state of monitor:" + m_monitor.isM_state());
        System.out.println("Current state of keyboard:" + k_keybord.isK_state());
        System.out.println("Current state of mouse:" + m_mouse.isMo_state());
    }
    public void printConnectionOfMouse(){
        if(m_mouse.isMo_state()){
            System.out.println("Mouse is connected");
        }else {
            System.out.println("Mouse is disconnected");
        }
    }
    public void printConnectionOfKeyboard(){
        if(k_keybord.isK_state()){
            System.out.println("Keyboard is connected");
        }else {
            System.out.println("Keyboard is disconnected");
        }
    }
    public void printConnectionOfMonitor(){
        if(m_monitor.isM_state()){
            System.out.println("Monitor is connected");
        }else {
            System.out.println("Monitor is disconnected");
        }
    }
    public void AttachMonitor(){
        if(!m_monitor.isM_state()){
            m_monitor.setM_state(true);

            fout.println("New state of monitor: " + m_monitor.isM_state());
            System.out.println("Monitor connected!!!");
        }
        else{
            System.out.println("The monitor is already attached!");
        }
    }
    public void RemoveMonitor(){
        if(m_monitor.isM_state()){
            m_monitor.setM_state(false);

            fout.println("New state of monitor: " + m_monitor.isM_state());
            System.out.println("Monitor removed!!!");
        }
        else{
            System.out.println("The monitor is already removed!");
        }
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
    public void AttachKeyboard(){
        if(!k_keybord.isK_state()){
            k_keybord.setK_state(true);

            fout.println("New state of keyboard: " + k_keybord.isK_state());
            System.out.println("Keyboard connected!!!");
        }
        else{
            System.out.println("The keyboard is already attached!");
        }
    }
    public void RemoveKeyboard(){
        if(k_keybord.isK_state()){
            k_keybord.setK_state(false);

            fout.println("New state of keyboard: " + k_keybord.isK_state());
            System.out.println("Keyboard removed!!!");
        }
        else{
            System.out.println("The keyboard is already removed!");
        }
    }
}
