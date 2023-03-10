package org.example.practice1_family;
import java.util.ArrayList;

public class GeoTree {
    private ArrayList<Node> tree = new ArrayList<>();

    public ArrayList<Node> getTree() {
        return tree;
    }

    /**
     *
     * @param person1 - родитель
     * @param person2 - ребенок
     */
    public void append(Person person1, Person person2) {
        if (person1 != person2) {
            tree.add(new Node(person1, Relationship.parent, person2));
            tree.add(new Node(person2, Relationship.children, person1));
        } else {
            System.out.printf("%s и %s - Такие родственные связи невозможны. ", person1.getFullName(), person2.getFullName());
            System.out.println();
        }
    }

    public void appendPartner(Person person1, Person person2) {
        if (person1.getGender() != person2.getGender() && person1 != person2) {
            tree.add(new Node(person1, Relationship.partner, person2));
            tree.add(new Node(person2, Relationship.partner, person1));
        } else {
            System.out.printf("%s и %s - нельзя жениться. ", person1.getFullName(), person2.getFullName());
            System.out.println();
        }
    }
}
