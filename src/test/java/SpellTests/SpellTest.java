package SpellTests;

import Enemy.Ogre;
import Spells.Spell;
import Spells.SpellTypes;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SpellTest {

    Spell spell;
    Ogre ogre;

    @Before
    public void setup(){
        spell = new Spell("Ice Blast", 10, SpellTypes.ICE);
        ogre = new Ogre(50, 10, "GET OOT MA SWAMP");
    }

    @Test
    public void hasName(){
        assertEquals("Ice Blast", spell.getName());
    }

    @Test
    public void hasDamage(){
        assertEquals(10, spell.getDamage());
    }

    @Test
    public void hasType(){
        assertEquals(SpellTypes.ICE, spell.getType());
    }

    @Test
    public void canInflictDamage(){
        spell.inflictDamage(ogre);
        assertEquals(40, ogre.getHealthPoints());
    }
}
