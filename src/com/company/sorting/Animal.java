package com.company.sorting;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author - LeeN
 * PROJECT NAME: Java-Quiz-Yourself
 * CREATED ON: Sunday 19 September 2021 - 7:58 PM
 */
public class Animal {
    private String name;
    private int numOfLegs;
    private int numOfWings;
    public Animal(String name, int numOfLegs, int numOfWings) {
        this.name = name;
        this.numOfLegs = numOfLegs;
        this.numOfWings = numOfWings;
    }
   // getters and setters


    public String getName() {
        return name;
    }

    public int getNumOfLegs() {
        return numOfLegs;
    }

    public int getNumOfWings() {
        return numOfWings;
    }

    @Override
    public String toString() {
        return name;
    }

    public static void main(String[] args) {
        List<Animal> listOfAnimal = List.of(
                new Animal("Spider", 8, 0),
                new Animal("Fly", 6, 2),
                new Animal("Dragonfly", 6, 4),
                new Animal("Worm", 0, 0)
        );
// add sorting code here
        listOfAnimal.stream()
                .sorted(Comparator.comparing(Animal::getNumOfLegs)
                .thenComparing(Animal::getNumOfWings))
                .collect(Collectors.toList())
                .forEach(System.out::println);

//        listOfAnimal.stream().sorted(Comparator.comparing(a -> a.getNumOfLegs()).thenComparing(a -> a.getNumOfWings())).collect(Collectors.toList());


//        for (Animal animal: listOfAnimal){
//            System.out.println(animal);
//        }
    }
}
