package module.hardware;

import java.util.List;

public interface RamConfigurationModules {
    void addRamModule(Ram ram);
    List<Ram> getAllRams();
}
