package MageTests;

import Enemy.Ogre;
import Player.Mage.Mage;
import Player.Mage.Wizard;
import Spells.Spell;
import Spells.SpellTypes;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WizardTest {

    private Wizard wizard;
    private Spell spell;
    private Ogre ogre;

    @Before
    public void setUp(){
        wizard = new Wizard("Gandalf");
        spell = new Spell("Fireball", 20, SpellTypes.FIRE);
        ogre = new Ogre(50, 10, "GET OOT ME SWAMP");
    }

    @Test
    public void canGetActiveSpell(){
        wizard.addSpell(spell);
        wizard.setActiveSpell(spell);
        assertEquals(true, wizard.getSpellList().contains(spell));
    }

    @Test
    public void canGetActiveSpellWhenUnset(){
        assertEquals(null, wizard.getActiveSpell());
    }

    @Test
    public void canAttackEnemy(){
        wizard.addSpell(spell);
        wizard.setActiveSpell(spell);
        wizard.attackEnemy(ogre);
        assertEquals(30, ogre.getHealthPoints());
    }

}
