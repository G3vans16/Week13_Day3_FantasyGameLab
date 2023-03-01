package Spells;

import Enemy.Enemy;
import Interfaces.IDamage;

public class Spell implements IDamage {

    private String name;
    private int damage;
    SpellTypes type;

    public Spell(String name, int damage, SpellTypes type){
        this.name = name;
        this.damage = damage;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

    public SpellTypes getType() {
        return type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setType(SpellTypes type) {
        this.type = type;
    }

    public String attack() {
        return null;
    }

    public void inflictDamage(Enemy enemy){
        enemy.takeDamage(this);

    }

}
