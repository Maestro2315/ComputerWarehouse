package module.hardware;

import java.util.Objects;

public class MotherBoard {
    private final String name;
    private final int socket;
    private final String ram;
    private final String pci;

    public MotherBoard(int socket, String ram, String pci, String name) {
        this.name = name;
        this.pci = pci;
        this.ram = ram;
        this.socket = socket;

    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("\nname: ");
        stringBuilder.append(this.name);
        stringBuilder.append("PCI");
        stringBuilder.append(this.pci);
        stringBuilder.append("\nram: ");
        stringBuilder.append(this.ram);
        stringBuilder.append("\nsocket: ");
        stringBuilder.append(this.socket);

        return stringBuilder.toString();

        //return "\nname: " + this.name + "PCI" + this.pci + "\nram: " + this.ram + "\nsocket: " + this.socket;
    }

    public boolean equals(Object obj) {
        MotherBoard otherMotherboard = (MotherBoard) obj;
        if (otherMotherboard == null) {
            return false;
        }

        if (!(this.name.equals(otherMotherboard.name)
                && Objects.equals(this.pci, otherMotherboard.pci)
                && Objects.equals(this.pci, otherMotherboard.pci)
                && Objects.equals(this.socket, otherMotherboard.socket))) {
            System.out.println("MotherBoards are different!");
            return false;
        }
        return true;
    }
}