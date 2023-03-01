package WeaponTypes;

import Enemy.Dragon;

public class Axe extends Weapon{
    public Axe(String name, int damage) {
        super(name, damage);
    }

    @Override
    public String attack() {
        return "THUD";
    }
}
