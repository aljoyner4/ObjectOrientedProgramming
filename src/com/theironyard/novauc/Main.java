package com.theironyard.novauc;

import java.util.ArrayList;

public class Main {
    public static ArrayList<Tree> myTrees = new ArrayList<>();
    public static void main(String[] args) {

        addTrees("Georgia Fine", 2, "peach");
        addTrees("Red Delicious", 2, "apple");
        addTrees("green", 2, "pear");
        addTrees("red", 2, "plum");
        addTrees("navel", 2, "orange");

        for(Tree fruit: myTrees) {
            System.out.println(String.format("%s: %s", fruit.category, fruit.name));
        }
    }

     public static void addTrees(String name, int quantity, String  category){
        switch (category){
            case "apple":
                myTrees.add(new Apple(name, quantity));
                break;
            case "orange":
                myTrees.add(new Orange(name, quantity));
                break;
            case "peach":
                myTrees.add(new Peach(name, quantity));
                break;
            case "pear":
                myTrees.add(new Pear(name, quantity));
                break;
            case "plum":
                myTrees.add(new Plum(name, quantity));
                break;
                default:
                    System.out.println("wrong tree entered");
                    break;
        }
    }
}
