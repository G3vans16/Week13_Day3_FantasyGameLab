package Spells;

public enum SpellTypes {

    LIGHTNING,
    FIRE,
    ICE,
    EARTH;


    public String toString() {
        if (this == LIGHTNING) {
            return "Lighting";
        } else if (this == FIRE) {
            return "Fire";
        } else if (this == ICE) {
            return "Ice";
        }else if (this == EARTH) {
                return "Earth";
        } else {
            throw new IllegalArgumentException();
        }
    }
}
