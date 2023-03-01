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

    public void setActivePotion(HealPotion potion) {
        if (potionList.contains(potion)) {
            this.activePotion = potion;
        }
    }

    public ArrayList<HealPotion> getPotionList() {
        return potionList;
    }

    public void setPotionList(ArrayList<HealPotion> potionList) {
        this.potionList = potionList;
    }

    public int getPotionListSize(){
        return this.potionList.size();
    }

    public void addPotionToList(HealPotion potion) {
        this.potionList.add(potion);
    }

    public void heal(Player player){
         //add code to heal chosen player
    }

}











