package Player.Mage;
import Enemy.Enemy;
import Player.Player;
import Spells.Spell;
import WeaponTypes.Weapon;

import java.util.ArrayList;

public abstract class Mage extends Player {

    private Spell activeSpell;
    private ArrayList<Spell> spellList;

    public Mage(String name) {
        super(name);
        this.activeSpell = null;
        this.spellList = new ArrayList<>();
    }

    public Spell getActiveSpell() {
        return activeSpell;
    }

    public void setActiveSpell(Spell spell) {
        if (spellList.contains(spell)) {
            this.activeSpell = spell;
        }
    }

    public ArrayList<Spell> getSpellList() {
        return spellList;
    }

    public void setSpellList(ArrayList<Spell> spellList) {
        this.spellList = spellList;
    }

    public void addSpell(Spell spell){
        spellList.add(spell);
    }

    public void attackEnemy(Enemy enemy){
        if(activeSpell != null){
            activeSpell.inflictDamage(enemy);
        }
    }

}
