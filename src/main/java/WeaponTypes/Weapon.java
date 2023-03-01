package WeaponTypes;

import Enemy.Enemy;
import Interfaces.IDamage;

public abstract class Weapon implements IDamage {

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


    public void inflictDamage(Enemy enemy) {
        enemy.takeDamage(this);

    }

    public int getDamage() {
        return damage;
    }

    public void reduceDurability() {
        this.durability -= 1;
    }
}
