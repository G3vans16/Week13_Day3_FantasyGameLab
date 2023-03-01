package ClericTests;

import Player.Cleric.Cleric;
import Potions.HealPotion;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class ClericTest {

    Cleric cleric;
    HealPotion potion;

    @Before
    public void setUp(){
        cleric = new Cleric("Dr.Heal");
        potion = HealPotion.WEAK;
    }

    @Test
    public void hasName(){
        assertEquals("Dr.Heal", cleric.getName());
    }

    @Test
    public void startsWithFullHealth(){
        assertEquals(100, cleric.getHealth());
    }

    @Test
    public void startsWithEmptyPotionList(){
        assertEquals(0, cleric.getPotionListSize());
    }

    @Test
    public void canAddPotionToList(){
        cleric.addPotionToList(potion);
        assertEquals(true, cleric.getPotionList().contains(potion));
    }

    @Test
    public void canSetActivePotion(){
        cleric.addPotionToList(potion);
        cleric.setActivePotion(potion);
        assertEquals(potion, cleric.getActivePotion());
    }

    @Test
    public void cantSetActivePotionIfListEmpty(){
        cleric.setActivePotion(potion);
        assertEquals(null, cleric.getActivePotion());
    }

}
