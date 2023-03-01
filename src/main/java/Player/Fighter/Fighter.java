package Player.Fighter;

import Enemy.Enemy;
import Player.Player;
import WeaponTypes.Weapon;
import Interfaces.IDamage;

import java.util.ArrayList;

public abstract class Fighter extends Player {

    private Weapon activeWeapon;
    private ArrayList<Weapon> weaponList;

    public Fighter(String name) {
        super(name);
        this.activeWeapon = null;
        this.weaponList = new ArrayList<>();
    }

    public Weapon getActiveWeapon() {
        return activeWeapon;
    }

    public ArrayList<Weapon> getWeaponList() {
        return weaponList;
    }

    public void setWeaponList(ArrayList<Weapon> weaponList) {
        this.weaponList = weaponList;
    }

    public void addWeapon(Weapon weapon){
        weaponList.add(weapon);
    }

    public void setActiveWeapon(Weapon weapon) {
        if(weaponList.contains(weapon)){
            this.activeWeapon = weapon;
        }
    }
    public void attackEnemy(Enemy enemy){
        if(activeWeapon != null){
            activeWeapon.inflictDamage(enemy);
            activeWeapon.reduceDurability();
        }
    }

}