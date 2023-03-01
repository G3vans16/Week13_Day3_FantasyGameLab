package WeaponTypes;

public class Sword extends Weapon{
    public Sword(String name, int damage) {
        super(name, damage);
    }

    @Override
    public String attack() {
        return "SWOOSH";
    }
}
