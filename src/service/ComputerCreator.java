package service;

import module.*;
import module.hardware.*;

public class ComputerCreator {

    public ComputerCreator() {
    }

    public Computer createAerocool() {
        RamConfiguration ramConfiguration = new RamConfiguration();
        Ram ramAerocool1 = new Ram("Veagence", "8GB", "3600Mhz");
        Ram ramAerocool2 = new Ram("Veagence", "8GB", "3600MHz");
        HddConfiguration hddConfiguration = new HddConfiguration();
        Hdd hddAerocool1 = new Hdd(1400, "1TB", "AerocoolHard");
        hddConfiguration.addHddModules(hddAerocool1);
        ramConfiguration.addRamModule(ramAerocool1);
        ramConfiguration.addRamModule(ramAerocool2);
        MotherBoard mom = new MotherBoard(2011, "2 slots", "Express 4.0 Hardware Design", "H480m");
        VideoAdapter videocard = new VideoAdapter("GTX1060", "3GB");
//        Hdd hddshnik = new Hdd(5400, "1TB");
        Cpu processor = new Cpu("4.2MHz", 2011, 4, 8);
       /* Scanner sc = new Scanner(System.in);
        System.out.println("Частота процессора в MHz: ");
        String cpuFrequency = sc.nextLine();
        System.out.println("Номер сокета: ");
        int cpuSocket = sc.nextInt();
        System.out.println("Колличество ядер: ");
        int cpuCores = sc.nextInt();
        System.out.println("Колличество потоков: ");
        int cpuStreams = sc.nextInt();*/

        // module.hardware.Cpu cpu1 = new module.hardware.Cpu(cpuFrequency, cpuSocket, cpuCores, cpuStreams);

        Computer aerocool = new Computer("Aerocool", mom, videocard, ramConfiguration, hddConfiguration, processor);
        return aerocool;
    }

    public Computer createHyper() {
        RamConfiguration ramConfiguration = new RamConfiguration();
        Ram ramHyper1 = new Ram("HyperX", "8GB", "4200Mhz");
        Ram ramHyper2 = new Ram("HyperX", "8GB", "4200MHz");
        ramConfiguration.addRamModule(ramHyper1);
        ramConfiguration.addRamModule(ramHyper2);
        HddConfiguration hddConfiguration = new HddConfiguration();
        Hdd hddHyper1 = new Hdd(2600, "2TB", "HyperxHard");
        Hdd hddHyper2 = new Hdd(2600, "2TB", "HyperxHard");
        hddConfiguration.addHddModules(hddHyper1);
        hddConfiguration.addHddModules(hddHyper2);
        MotherBoard mom = new MotherBoard(1200, "4 slots", "Express 6.0 Hardware Design", "H540g");
        VideoAdapter videocard = new VideoAdapter("GTX1660", "6GB");
        //Hdd hddshnik = new Hdd(6200, "2TB");
        Cpu processor = new Cpu("4.4MHz", 1200, 6, 12);
        Computer hyper = new Computer("hyper", mom, videocard, ramConfiguration, hddConfiguration, processor);
        return hyper;
    }

    public Computer createCougar() {
        RamConfiguration ramConfiguration = new RamConfiguration();
        Ram ramCougar2 = new Ram("Asus", "8GB", "3800MHz");
        ramConfiguration.addRamModule(ramCougar2);
        HddConfiguration hddConfiguration = new HddConfiguration();
        Hdd hddCougar1 = new Hdd(1800, "1TB","CougarHard");
        hddConfiguration.addHddModules(hddCougar1);
        MotherBoard mom = new MotherBoard(1200, "4 slots", "UltraMega SKILL 2.0", "Roofn");
        VideoAdapter videocard = new VideoAdapter("GTX3090", "12GB");
       // Hdd hddshka = new Hdd(6200, "2TB");
        Cpu processor = new Cpu("4.6MHz", 2022, 6, 12);
        Computer cougar = new Computer("cougar", mom, videocard, ramConfiguration, hddConfiguration, processor);
        return cougar;
    }

    public Computer createSamsung() {
        RamConfiguration ramConfiguration = new RamConfiguration();
        Ram ramSamsung1 = new Ram("Samsung", "4GB", "2800Mhz");
        Ram ramSamsung2 = new Ram("Samsung", "4GB", "2800MHz");
        ramConfiguration.addRamModule(ramSamsung1);
        ramConfiguration.addRamModule(ramSamsung2);
        HddConfiguration hddConfiguration = new HddConfiguration();
        Hdd hddSamsung1 = new Hdd(1800,"1TB", "SamsungHard");
        hddConfiguration.addHddModules(hddSamsung1);
        MotherBoard mom = new MotherBoard(5060, "2 slots", "SLABIY PC v1.0", "noob");
        VideoAdapter videocard = new VideoAdapter("GTX650", "2GB");
        //Hdd hddshka = new Hdd(1400, "500GB");
        Cpu processor = new Cpu("2.1MHz", 1200, 2, 4);
        Computer samsung = new Computer("samsung", mom, videocard, ramConfiguration, hddConfiguration, processor);
        return samsung;
    }

    public Computer createSamsung2() {
        RamConfiguration ramConfiguration = new RamConfiguration();
        Ram ramSamsung1 = new Ram("Samsung", "4GB", "2800Mhz");
        Ram ramSamsung2 = new Ram("Samsung", "4GB", "2800MHz");
        ramConfiguration.addRamModule(ramSamsung1);
        ramConfiguration.addRamModule(ramSamsung2);
        HddConfiguration hddConfiguration = new HddConfiguration();
        Hdd hddSamsung1 = new Hdd(1800,"1TB", "SamsungHard");
        hddConfiguration.addHddModules(hddSamsung1);
        MotherBoard mom = new MotherBoard(5060, "2 slots", "SLABIY PC v1.0", "noob");
        VideoAdapter videocard = new VideoAdapter("GTX650", "2GB");
       // Hdd hddshka = new Hdd(1400, "500GB");
        Cpu processor = new Cpu("2.1MHz", 1200, 2, 4);
        Computer samsung2 = new Computer("samsung", mom, videocard, ramConfiguration, hddConfiguration, processor);
        return samsung2;
    }
}
