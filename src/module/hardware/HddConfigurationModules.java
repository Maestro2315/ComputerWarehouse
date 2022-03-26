package module.hardware;

import java.util.List;

public interface HddConfigurationModules {
    void addHddModules(Hdd hdd);
    List<Hdd> getAllHdds();
}
