import module.Computer;
import module.hardware.Hdd;
import service.ComputerCreator;

import java.util.List;
import java.util.Scanner;
import module.hardware.Ram;
import service.ComputerCreator;

public class Main {
    public Scanner scanner;

    public static void main(String[] args) {
        ComputerCreator computerCreator = new ComputerCreator();
        Computer computerhyper = computerCreator.createHyper();
//        Computer computeraerocool = computerCreator.createAerocool();
//        Computer computercougar = computerCreator.createCougar();
        Computer computersamsung = computerCreator.createSamsung();
        Computer computersamsung2 = computerCreator.createSamsung2();
        System.out.println(computerCreator.createHyper());
        System.out.println(computersamsung.equals(computersamsung2));
        System.out.println("Search ram by name Hyper");
        for (Ram ram : computerhyper.getRamConfiguration().searchByName("Hyper")) {
            System.out.println(ram);
        }

        for (Ram ram : computerhyper.getRamConfiguration().getAllRams()){
            System.out.println(ram);
        }
        System.out.println("\nSearch hdd by name HyperHard");
        for (Hdd hdd : computerhyper.getHddConfiguration().searchByName("HyperHard")){
            System.out.println(hdd);
        }
        for (Hdd hdd : computerhyper.getHddConfiguration().getAllHdds()){
            System.out.println(hdd);
        }
        // module.Devices headphones = new module.Headphones();
        // ((module.Headphones) headphones).plays();
        // module.Devices monitor = new module.Monitor();
        // ((module.Monitor) monitor).showsPic();
        // module.Devices[] devices = {monitor, headphones};
        // module.Devices FriendPC = new FriendPC("hyperpc");
        // module.Devices[] devices = {FriendPC};
        //for (module.Devices device : devices) {
        //    device.turnOn();
        // }

        //for (module.Devices device : devices)
        //   device.turnOff();

        //service.ComputerCreator service.ComputerCreator = new service.ComputerCreator();
        //System.out.println(service.ComputerCreator.create());
//pov: Заработало лол.
    }
}
