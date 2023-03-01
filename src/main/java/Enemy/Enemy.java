package Enemy;

import Interfaces.IDamage;
import Interfaces.IDefend;
import WeaponTypes.Weapon;

public abstract class Enemy implements IDefend {
    int healthPoints;
    int attackStrength;
    String vocalisation;

    public Enemy(int healthPoints, int attackStrength, String vocalisation) {
        this.healthPoints = healthPoints;
        this.attackStrength = attackStrength;
        this.vocalisation = vocalisation;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void takeDamage(IDamage damagable){
        this.healthPoints -= damagable.getDamage();
    }

    public int getAttackStrength() {
        return attackStrength;
    }

    public String getVocalisation() {
        return vocalisation;
    }
}
