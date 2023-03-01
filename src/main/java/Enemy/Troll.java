package Enemy;

import Interfaces.IDefend;

public class Troll extends Enemy implements IDefend {
    public Troll(int healthPoints, int attackStrength, String vocalisation) {
        super(healthPoints, attackStrength, vocalisation);
    }

    @Override
    public String defend() {
        return "My names Dan";
    }
}
