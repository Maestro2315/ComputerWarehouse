package module.hardware;

import java.util.ArrayList;
import java.util.List;

public class RamConfiguration implements RamConfigurationModules {
    private final List<Ram> rams;

    public RamConfiguration() {
        this.rams = new ArrayList<>();
        {
        }
    }

    @Override
    public void addRamModule(Ram ram) {
        rams.add(ram);
    }

    public List<Ram> getAllRams() {
        return rams;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Ram ram : rams) {
            stringBuilder.append(ram);
        }
        return stringBuilder.toString();
    }

    public List<Ram> searchByName(String name) {
        List<Ram> result = new ArrayList<>();
        for (Ram ram : rams) {
            if (ram.getName().equalsIgnoreCase(name)) {
                result.add(ram);
            }
        }
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass())
            return false;
        RamConfiguration that = (RamConfiguration) o;
        return rams.equals(that.rams);
    }
}
    //TODO сделать редактирование(поиск по заданным параметрам и из всех что нашлись берем первоеи заменяем на то что приходит если нету то выводим на экран не нашлось) и удаление(поиск по имени)
    //}