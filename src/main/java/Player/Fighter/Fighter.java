package Player.Fighter;

import Enemy.Enemy;
import Player.Player;
import Interfaces.IWeapon;
import WeaponTypes.Weapon;
import Interfaces.IDamage;

import java.util.ArrayList;

public abstract class Fighter extends Player {

    private IWeapon activeWeapon;
    private ArrayList<IWeapon> weaponList;

    public Fighter(String name) {
        super(name);
        this.activeWeapon = null;
        this.weaponList = new ArrayList<>();
    }

    public IWeapon getActiveWeapon() {
        return activeWeapon;
    }

    public ArrayList<IWeapon> getWeaponList() {
        return weaponList;
    }

    public void setWeaponList(ArrayList<IWeapon> weaponList) {
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