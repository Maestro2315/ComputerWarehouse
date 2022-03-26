package module.hardware;

import java.util.Objects;

public class Hdd {
    private final int frequency;
    private final String quantitymemory;
    private final String name;

    public Hdd(int frequency, String quantitymemory, String name){
        this.frequency = frequency;
        this.quantitymemory = quantitymemory;
        this.name = name;
    }

    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("\nfrequency: ");
        stringBuilder.append(this.frequency);
        stringBuilder.append("\nquantityMemory: ");
        stringBuilder.append(this.quantitymemory);

        return stringBuilder.toString();

        //return "\nfrequency: " + this.frequency + "\nquantityMemory: " + this.quantitymemory;

    }
    public String getName() {
        return this.name;
    }

    public boolean equals(Object obj) {
        Hdd otherHdd = (Hdd) obj;
        if (otherHdd == null) {
            return false;
        }

        if (!(this.quantitymemory.equals(otherHdd.quantitymemory)
                && Objects.equals(this.frequency, otherHdd.frequency))) {
            System.out.println("Ram's are different!");
            return false;
        }
        return true;
    }
}