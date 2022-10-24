package lab4;

import lab3.Keyboard;
import lab3.Monitor;
import lab3.Mouse;

import java.io.PrintWriter;

public abstract class ComputerAbstract {

    protected Mouse m_mouse;
    protected Keyboard k_keybord;
    protected Monitor m_monitor;
    protected PrintWriter fout;
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
    class Keyboard {

        private boolean K_state;

        public Keyboard(){
            this.K_state = false;
        }

        public boolean isK_state() {
            return K_state;
        }

        public void setK_state(boolean k_state) {
            K_state = k_state;
        }
    }
    class Monitor {
        private boolean M_state;
        public Monitor(){
            this.M_state = false;
        }

        public boolean isM_state() {
            return M_state;
        }

        public void setM_state(boolean m_state) {
            M_state = m_state;
        }
    }
    class Mouse {
        private boolean Mo_state;

        public Mouse() {
            this.Mo_state = false;
        }


        public boolean isMo_state() {
            return Mo_state;
        }

        public void setMo_state(boolean mo_state) {
            Mo_state = mo_state;
        }
    }
}

