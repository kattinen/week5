// Factory.java 
// Kati Liukkonen
// Koodi kaaviosta, luokka Factory
// Visual Studio Code
// Versio 1.0
// No license

package main;

import java.util.ArrayList;

public class Factory {
    private String name;
    private ArrayList<Machine> machines;

    public Factory (String factoryName) {
        this.name = factoryName;
        this.machines = new ArrayList<Machine>();
    }

    public void addMachine (Machine machine) {
        machines.add(machine);
    }

    public ArrayList<Machine> getMachines() {
        return this.machines;
    }

    public String getName() {
        return this.name;
    }
   
}
