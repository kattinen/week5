// Machine.java 
// Kati Liukkonen
// Koodi kaaviosta, luokka Machine
// Visual Studio Code
// Versio 1.0
// No license

package main;

public class Machine {
    private String type;
    private String model;
    private Worker operator;
    
    public Machine (String machineType, String machineModel, Worker worker) {
        this.type = machineType;
        this.model = machineModel;
        this.operator = worker;
    }

    public String getMachineDetails() {
        String type = this.type;
        String model = this.model;
        Worker worker = this.operator;
        String name = worker.getWorkerName();
        String role = worker.getWorkerRole();
        String machineData = "Koneen tiedot: " + type + ", " + model; 
        String workerData = "Työntekijän tiedot: " + name + ", " + role;
        String data = machineData + System.lineSeparator() + workerData + System.lineSeparator();
        return data;
    }
}
