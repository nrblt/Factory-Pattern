package com.company;

public class HeroConcreteFactory implements HeroFactory{

    @Override
    public Hero heroPurchase(String heroName) {
        Hero hero = null;
        if(heroName=="AntiMag"){
            hero=new AntiMag();
        }
        else if(heroName=="CM"){
            hero=new CM();
        }
        else{
            System.out.println("Please, write again");
//            heroPurchase()
            return hero;
        }
        hero.itemForAura();
        hero.itemForDamage();
        hero.itemForMobility();
        hero.itemForDamage();


        return hero;
    }
}
