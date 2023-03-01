package Enemy;

import Interfaces.IDefend;

public class Ogre extends Enemy implements IDefend {
    public Ogre(int healthPoints, int attackStrength, String vocalisation) {
        super(healthPoints, attackStrength, vocalisation);
    }

    @Override
    public String defend() {
        return "Get out my swamp";
    }
}
