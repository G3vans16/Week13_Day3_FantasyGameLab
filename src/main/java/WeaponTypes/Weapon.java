package WeaponTypes;

import Enemy.Enemy;
import Interfaces.IDamage;
import Interfaces.IWeapon;

public abstract class Weapon implements IWeapon, IDamage {

    private String name;
    private int damage;
    private int durability ;

    public Weapon(String name, int damage){
        this.name = name;
        this.damage = damage;
        this.durability = 100;
    }

    public String getName() {
        return name;
    }

    public int getDurability() {
        return durability;
    }


    @Override
    public void inflictDamage(Enemy enemy) {
        enemy.takeDamage(this);

    }

    @Override
    public int getDamage() {
        return damage;
    }

    @Override
    public void reduceDurability() {
        this.durability -= 1;
    }
}
