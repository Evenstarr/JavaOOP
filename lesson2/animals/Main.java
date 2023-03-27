package org.example.lesson2.animals;

public class Main {
    public static void main(String[] args) {
        Cat catMurzik = new Cat("Мурзик", 5, "Полосатый", 100, 200);
        Human vasya = new Human("Вася");

        vasya.call(catMurzik);

        Dog dogSharik = new Dog("Шарик", 1, "Мраморный", 10, 20);

        vasya.call(dogSharik);

        dogSharik.Go();

        vasya.call(dogSharik);

        vasya.feed(dogSharik);

        Hamster hamsterHomyak = new Hamster("Хомяк", 2, "Рыжий", 10, 20);

        vasya.call(hamsterHomyak);
    }
}
