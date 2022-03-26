package module.hardware;

public enum Socket {
    LGA(),
    PGA(),
    ZIF();

    public class Cpu {
        Socket socket;

        public Cpu(Socket socket) {
            this.socket = socket;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();

            stringBuilder.append("LGA");
            stringBuilder.append("\n");
            stringBuilder.append("PGA");
            stringBuilder.append("\n");
            stringBuilder.append("ZIF");
            stringBuilder.append("\n");
            return stringBuilder.toString();

        }
    }
}