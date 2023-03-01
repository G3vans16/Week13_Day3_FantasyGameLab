package Enemy;

import Interfaces.IDefend;

public class Dragon extends Enemy implements IDefend {
    public Dragon(int healthPoints, int attackStrength, String vocalisation) {
        super(healthPoints, attackStrength, vocalisation);
    }

    @Override
    public String defend() {
        return "Rawr";
    }
}
