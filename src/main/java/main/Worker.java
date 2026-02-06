// Worker.java 
// Kati Liukkonen
// Koodi kaaviosta, luokka Worker
// Visual Studio Code
// Versio 1.0
// No license

package main;

public class Worker {
    private String name;
    private String role;

    public Worker (String workerName, String workerRole) {
        this.name = workerName;
        this.role = workerRole;
    }

    public String getWorkerName() {
        return this.name;
    }

    public String getWorkerRole() {
        return this.role;
    }
    
}
