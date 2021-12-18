package com.aidai;

public class Main {

    public static void main(String[] args) {
        Boss firstBoss = new Boss();
       firstBoss.setLife(500);
       firstBoss.setDamage(45);
       firstBoss.setWeapon(new Weapon( "magic", "sword"));

        System.out.println(firstBoss.printInfo());

        Skeleton skeleton  =  new Skeleton();
        skeleton.setLife(300);
        skeleton.setDamage(15);
        skeleton.setCountOfArrows(20);
        skeleton.setWeapon(new Weapon( "physical", "bow"));
        Skeleton skeleton2 = new Skeleton();
        skeleton2.setLife(150);
        skeleton2.setDamage(40);
        skeleton2.setCountOfArrows(8);
        Weapon skeleton2Weapon = new Weapon("fire", "arbalet");
        skeleton2.setWeapon(skeleton2Weapon);

        System.out.println(skeleton.printInfo());
        System.out.println(skeleton2.printInfo());









    }

}

/*


В классе Main создать 1 экземпляр босса и задать ему все свойства (значения полям). Затем распечатать всю информацию о боссе.
ДЗ на сообразительность:
Распечатывание информации сделать в методе в классе Босса public String printInfo(){}
Создать класс Skeleton (Скелет), унаследовать от Босса.
Добавить поле (кол-во стрел) и добавить геттеры и сеттеры.
Переопределить родительский метод printInfo в классе Skeleton
В Main распечатать информацию о Боссе с помощью метода printInfo, также создать 2 экземпляра скелета и заполнить данными) затем распечатать
 всю информацию о скелетах.
* */