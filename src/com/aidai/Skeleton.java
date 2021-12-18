package com.aidai;

public class Skeleton extends  Boss {
    private  int countOfArrows;

    public int getCountOfArrows() {
        return countOfArrows;
    }

    public void setCountOfArrows(int countOfArrows) {
        this.countOfArrows = countOfArrows;
    }

    @Override
    public String printInfo() {
        return super.printInfo() + "\n" +
                "Skeletons weapon:count of arrows" + countOfArrows + "\n" +
                "weapon name: " + getWeapon().getName() + "\n" +
                "weapon type:" + getWeapon().getType();
    }
}
