package module.hardware;

import java.util.Objects;

public class Cpu {
    private final String frequency;
    private final int socket;
    private final int core;
    private final int streams;

    public Cpu(String frequency, int socket, int core, int streams) {
        this.frequency = frequency;
        this.socket = socket;
        this.core = core;
        this.streams = streams;
    }

    public String toString() {

        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("\nfrequency: ");
        stringBuilder.append(this.frequency);
        stringBuilder.append("\nsocket: ");
        stringBuilder.append(this.socket);
        stringBuilder.append("\ncore: ");
        stringBuilder.append(this.core);
        stringBuilder.append("\nstreams: ");
        stringBuilder.append(this.streams);

        return stringBuilder.toString();
    }

    public boolean equals(Object obj) {
        Cpu otherCpu = (Cpu) obj;
        if (otherCpu == null) {
            return false;
        }

        if (!(this.frequency.equals(otherCpu.frequency)
                && Objects.equals(this.core, otherCpu.core)
                && Objects.equals(this.socket, otherCpu.socket)
                && Objects.equals(this.streams, otherCpu.streams))) {
            System.out.println("Cpu's are different!\n");
            return false;
        }
        return true;
    }
}