package org.example.pets;

import org.example.lecture1.Magician;
import org.example.practice1_shelf.Shelf;

import java.util.Random;

/**
 * Котик слышит человека на расстоянии maxDistance. Он может ходить. Если уйдет за расстояние, то человека не услышит
 */
public class Cat {
    private int distance;
    private int maxDistance;

    private String name;

    private static Random r;

    public Cat(String name, int distance, int maxDistance){
        this.name = name;
        this.distance = distance;
        this.maxDistance = maxDistance;
    }

    public void Go() {
        r = new Random();
        int dist = this.r.nextInt(-100, 200);
        System.out.printf("Кот двигается на %d метров", dist);
        System.out.println();
        this.distance += dist;
    }

    public void Answer() {
        if (this.distance > maxDistance) {
            System.out.println("Котик не услышал, слишком далеко");
        } else {
            SayMeow();
        }
    }

    private void SayMeow() {
        System.out.println("Meeeoow");
    }
}
