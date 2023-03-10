package org.example.pets;

public class Main {
    public static void main(String[] args) {
        Cat catMurzik = new Cat("Мурзик", 100, 200);
        Human vasya = new Human("Вася");
        vasya.calltheCat(catMurzik);
        catMurzik.Go();
        vasya.calltheCat(catMurzik);
    }
}
