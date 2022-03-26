package module;

import module.hardware.*;
import module.hardware.Cpu;
import module.hardware.MotherBoard;
import module.hardware.VideoAdapter;
import module.hardware.RamConfiguration;
import module.hardware.HddConfiguration;
import module.hardware.Socket;


public class Computer implements Devices {
    protected Socket socket;
    protected String name;
    protected MotherBoard motherboard;
    protected VideoAdapter videoadapter;
    protected RamConfiguration ramConfiguration;
    protected HddConfiguration hddConfiguration;
    protected Cpu cpu;

    public Computer(String name, MotherBoard motherboard, VideoAdapter videoadapter, RamConfiguration ramConfiguration, HddConfiguration hddConfiguration, Cpu cpu) {
        this.name = name;
        this.motherboard = motherboard;
        this.ramConfiguration = ramConfiguration;
        this.hddConfiguration = hddConfiguration;
        this.cpu = cpu;
        this.videoadapter = videoadapter;
    }

    public String getName(){
        return name;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("Computer name: ");
        stringBuilder.append(this.name);
        stringBuilder.append("\n\nMotherBoard: ");
        stringBuilder.append(this.motherboard);
        stringBuilder.append("\n\nRam: ");
        stringBuilder.append(this.ramConfiguration);
        stringBuilder.append("\n\nHdd: ");
        stringBuilder.append(this.hddConfiguration);
        stringBuilder.append("\n\nCPU: ");
        stringBuilder.append("\nType socket: ");
        stringBuilder.append(socket.LGA);
        stringBuilder.append(this.cpu);
        stringBuilder.append("\n\nVideoAdapter: ");
        stringBuilder.append(this.videoadapter);
        stringBuilder.append("\n================================================");
        //return "module.Computer name: " + this.name + "\nMotherBoard: " + this.motherboard + "\nRam: " + this.ram + "\nHdd: " + this.hdd + "\nCPU: " + this.cpu + "\nVideoAdapter: " + this.videoadapter;
        return stringBuilder.toString();

    }

    public void turnOn(){
        System.out.println(String.format("Computer '%s' is ON", name));
    }

    @Override
    public void turnOff() {
        System.out.println(String.format("Computer '%s' is OFF", name));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return socket == computer.socket
                && name.equals(computer.name)
                && motherboard.equals(computer.motherboard)
                && videoadapter.equals(computer.videoadapter)
                && ramConfiguration.equals(computer.ramConfiguration)
                && hddConfiguration.equals(computer.hddConfiguration)
                && cpu.equals(computer.cpu);
    }

    public RamConfiguration getRamConfiguration(){
        return ramConfiguration;
    }

    public HddConfiguration getHddConfiguration(){
        return hddConfiguration;
    }
}
