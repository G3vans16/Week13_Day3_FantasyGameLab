package Player.Cleric;
import Player.Player;
import Interfaces.IHeal;
import Potions.HealPotion;

import java.util.ArrayList;

public class Cleric extends Player implements IHeal {

    private HealPotion activePotion;
    private ArrayList<HealPotion> potionList;

    public Cleric(String name) {
        super(name);
        this.activePotion = null;
        this.potionList = new ArrayList<HealPotion>();
    }

    public HealPotion getActivePotion() {
        return activePotion;
    }

    public void setActivePotion(HealPotion activePotion) {
        this.activePotion = activePotion;
    }

    public ArrayList<HealPotion> getPotionList() {
        return potionList;
    }

    public void setPotionList(ArrayList<HealPotion> potionList) {
        this.potionList = potionList;
    }

    public String heal(){
        return "MEDIC!!!! oh wait that's me";
    }
}











