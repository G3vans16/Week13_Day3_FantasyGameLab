package WeaponTests;

import Enemy.Dragon;
import WeaponTypes.Sword;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SwordTest {

    Sword sword;

    Dragon dragon;

    @Before

    public void setUp(){
        dragon = new Dragon(100, 20, "Rar");
        sword = new Sword("power Bat", 90 );
    }

    @Test
    public void canDamage(){
        sword.inflictDamage(dragon);
        assertEquals(10, dragon.getHealthPoints());
    }

    @Test
    public void canReduceDurability(){
        sword.reduceDurability();
        assertEquals(99, sword.getDurability());
    }


}
