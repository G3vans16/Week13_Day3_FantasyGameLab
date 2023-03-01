package Potions;

public enum HealPotion {

    WEAK(20),
    ENHANCED(40),
    LENGENDARY(60),
    MYTHIC(100);

    private final int healPoints;

    HealPotion(int healPoints){
        this.healPoints = healPoints;
    }

}
