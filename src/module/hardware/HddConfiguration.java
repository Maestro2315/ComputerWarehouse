package module.hardware;

import java.util.ArrayList;
import java.util.List;

public class HddConfiguration implements HddConfigurationModules {

    private final List<Hdd> hdds;

    public HddConfiguration() {
        this.hdds = new ArrayList<>();{
        }
    }

    public List<Hdd> searchByName(String name) {
        List<Hdd> result = new ArrayList<>();
        for (Hdd hdd : hdds) {
            if (hdd.getName().equalsIgnoreCase(name)) {
                result.add(hdd);
            }
        }
        return result;
    }

    @Override
    public void addHddModules(Hdd hdd) {
        hdds.add(hdd);
    }

    @Override
    public List<Hdd> getAllHdds() {
        return hdds;
    }
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Hdd hdd : hdds) {
            stringBuilder.append(hdd);
        }
        return stringBuilder.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass())
            return false;
        HddConfiguration that = (HddConfiguration) o;
        return hdds.equals(that.hdds);
    }
}
