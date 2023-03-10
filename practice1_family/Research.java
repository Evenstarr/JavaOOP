package org.example.practice1_family;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;

public class Research {
    ArrayList<String> result = new ArrayList<>();

    ArrayList<Person> persons = new ArrayList<>();

    HashSet<Person> personHashSet = new HashSet<>();
    ArrayList<Node> tree;

    public Research(GeoTree geoTree) {
        tree = geoTree.getTree();
    }

    private ArrayList<String> spend(Person p, Relationship re) {
        for (Node t : tree) {
            if (Objects.equals(t.p1.getFullName(), p.getFullName()) && t.re == re) {
                result.add(t.p2.getFullName());
            }
        }
        return result;
    }

    private ArrayList<Person> spendPerson(Person p, Relationship re) {
        for (Node t : tree) {
            if (Objects.equals(t.p1.getFullName(), p.getFullName()) && t.re == re) {
                persons.add(t.p2);
            }
        }
        return persons;
    }

    public ArrayList<String> getChildren(Person p) {
        return spend(p, Relationship.parent);
    }

    public ArrayList<String> getParents(Person p) {
        return spend(p, Relationship.children);
    }

    public ArrayList<String> getPartners(Person p) {
        return spend(p, Relationship.partner);
    }

    public HashSet<String> getSiblings(Person p) {
        ArrayList<Person> parents = spendPerson(p, Relationship.children);
        HashSet<String> siblingsset = new HashSet<>();

        for (Person parent: parents) {
            for (String tmpPerson: spend(parent, Relationship.parent)) {
                if (!tmpPerson.equals(p.getFullName())) {
                    siblingsset.add(tmpPerson);
                }
            }
        }
        return siblingsset;
    }
}
