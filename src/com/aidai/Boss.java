package com.aidai;

import com.aidai.GameEntity;

public class Boss  extends GameEntity {
    private Weapon weapon;

    public Weapon getWeapon() {
        return weapon;
    }
    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public String printInfo(){
        return "Life: " + getLife() + " +  damage: " + getDamage();

    }
}
