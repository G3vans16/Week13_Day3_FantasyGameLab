package WeaponTypes;

public class Club extends Weapon{
    public Club(String name, int damage) {
        super(name, damage);
    }

    public String attack() {
        return "BOSH";
    }
}
