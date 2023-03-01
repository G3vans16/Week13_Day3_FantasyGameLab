package Interfaces;

import Enemy.Enemy;

public interface IDamage {
    String attack();

    void inflictDamage(Enemy enemy);

    int getDamage();
}
