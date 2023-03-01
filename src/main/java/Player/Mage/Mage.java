package Player.Mage;
import Player.Player;
import Interfaces.IDefend;
import Interfaces.ISpell;

import java.util.ArrayList;

public abstract class Mage extends Player implements ISpell {

    private ISpell activeSpell;
    private ArrayList<ISpell> spellList;

    public Mage(String name) {
        super(name);
        this.activeSpell = null;
        this.spellList = new ArrayList<ISpell>();
    }

    public ISpell getActiveSpell() {
        return activeSpell;
    }

    public void setActiveSpell(ISpell activeSpell) {
        this.activeSpell = activeSpell;
    }

    public ArrayList<ISpell> getSpellList() {
        return spellList;
    }

    public void setSpellList(ArrayList<ISpell> spellList) {
        this.spellList = spellList;
    }
}
