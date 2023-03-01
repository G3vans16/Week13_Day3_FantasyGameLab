package FighterTests;

import Enemy.Dragon;
import Player.Fighter.Knight;
import WeaponTypes.Axe;
import WeaponTypes.Club;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KnightTest {

    Knight knight;
    Club club;
    Axe axe;
    Dragon dragon;

    @Before
    public void setUp(){
        knight = new Knight(" Sir Gareth");
        club = new Club("Golf Club", 10);
        axe = new Axe("Big Boy", 25);
        dragon = new Dragon(100, 5, "rar" );
    }

    @Test
    public void canAddWeapon(){
        knight.addWeapon(club);
        assertEquals(true, knight.getWeaponList().contains(club));
    }

    @Test
    public void canSetActiveWeapon(){
        knight.addWeapon(club);
        knight.setActiveWeapon(club);
        assertEquals(club, knight.getActiveWeapon());
    }


    @Test
    public void canSwitchActiveWeapon(){
        knight.addWeapon(club);
        knight.addWeapon(axe);
        knight.setActiveWeapon(club);
        assertEquals(club, knight.getActiveWeapon());
        knight.setActiveWeapon(axe);
        assertEquals(axe, knight.getActiveWeapon());
    }

    @Test
    public void canAttack(){
        knight.addWeapon(club);
        knight.setActiveWeapon(club);
        knight.attackEnemy(dragon);
        assertEquals(90, dragon.getHealthPoints());
        assertEquals(99, club.getDurability());
    }




}
