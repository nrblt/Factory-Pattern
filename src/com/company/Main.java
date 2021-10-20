package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        HeroFactory heroFactory=new HeroConcreteFactory();
        heroFactory.heroPurchase("CM");
        System.out.println("\n");

        heroFactory.heroPurchase("AntiMag");


    }
}
