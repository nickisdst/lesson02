package org.example;

public class City {
    private int population;
    private String name;

    public static final long MAX_NUMBER_OF_PEOPLE = 322228;

    public City(int population, String name){
        this.population = population;
        this.name = name;
    }

    public City(){
        this.population = 322228;
        this.name = "No Name";
    }

    public void printInfo(){
        System.out.println("Название города: " + name + "\n" + "Население: " + population + "\n" + "Максимальное население: " + MAX_NUMBER_OF_PEOPLE);
    }
}
