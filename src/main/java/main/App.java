// App.java 
// Kati Liukkonen
// Koodi kaaviosta
// Visual Studio Code
// Versio 1.0
// No license

package main;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Anna tehtaalle nimi:");
        String factoryName = sc.nextLine();
        Factory factory = new Factory(factoryName);

        boolean exit = false;
        while (!exit) {
            System.out.println("1) Lisää kone");
            System.out.println("2) Listaa kaikki koneet");
            System.out.println("0) Lopeta ohjelma");

            if(sc.hasNext()) {
                int i = 0;
                String stringInput = sc.nextLine();
                i = Integer.parseInt(stringInput);

                switch(i){
                    case 1: 
                        System.out.println("Anna koneen tyyppi:");
                        String machineType = sc.nextLine();
                        System.out.println("Anna koneen malli:");
                        String machineModel = sc.nextLine();
                        System.out.println("Anna työntekijän nimi:");
                        String workerName = sc.nextLine();
                        System.out.println("Anna työntekijän ammattinimike:");
                        String workerRole =sc.nextLine();
                        Worker worker = new Worker(workerName, workerRole);
                        Machine machine = new Machine(machineType, machineModel, worker);
                        factory.addMachine(machine);
                        System.out.println("Kone lisätty!");
                        break;
                    case 2:
                        String name = factory.getName();
                        System.out.println("Tehtaasta " + name + " löytyy seuraavat koneet:");
                        factory.getMachines();
                        break;
                    case 0:
                        System.out.println("Kiitos ohjelman käytöstä.");
                        exit = true;
                        break;
                    default:
                        System.out.println("Syöte oli väärä.");
                        break;
                }
            }
        }
        sc.close();
    }
}

