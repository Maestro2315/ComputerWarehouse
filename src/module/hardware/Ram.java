package module.hardware;

import java.util.Objects;

public class Ram {
    private final String name;
    private final String quantity;
    private final String  frequency;

    public Ram(String name, String quantity, String frequency){
        this.name = name;
        this.frequency = frequency;
        this.quantity = quantity;
    }

    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\nname: ");
        stringBuilder.append(this.name);
        stringBuilder.append("\nfrequency: ");
        stringBuilder.append(this.frequency);
        stringBuilder.append("\nquantity: ");
        stringBuilder.append(this.quantity);

        return stringBuilder.toString();

        //return "\nname: " + this.name + "\nfrequency: " + this.frequency + "\nquantity: " + this.quantity;
    }

    public String getName() {
        return this.name;
    }

    public boolean equals(Object obj) {
        Ram otherRam = (Ram) obj;
        if (otherRam == null) {
            return false;
        }

        if (!(this.name.equals(otherRam.name)
                && Objects.equals(this.frequency, otherRam.frequency)
                && Objects.equals(this.frequency, otherRam.frequency))) {
            System.out.println("Ram's are different!");
            return false;
        }
        return true;
    }
}