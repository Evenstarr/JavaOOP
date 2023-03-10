package org.example.practice1_family;

public class Main {
    public static void main(String[] args) {
        Person irina = new Person("Ирина", false);
        Person vasya = new Person("Вася", true);
        Person masha = new Person("Маша", false);
        Person jane = new Person("Женя", false);
        Person ivan = new Person("Ваня", true);
        Person sergey_vasyas_father = new Person("Сергей", true);
        Person petr = new Person("Петр", true);
        Person unknownGrandmother = new Person(false);

        GeoTree gt = new GeoTree();
        gt.append(irina, vasya);
        gt.append(irina, masha);
        gt.append(vasya, jane);
        gt.append(vasya, ivan);
        gt.append(sergey_vasyas_father, vasya);

        gt.appendPartner(sergey_vasyas_father, irina);
        gt.appendPartner(sergey_vasyas_father, petr);
        gt.appendPartner(petr, irina);
        gt.appendPartner(petr, unknownGrandmother);

        View view = new View();
        view.viewChildren(irina, gt);
        view.viewParents(vasya, gt);
        view.viewSiblings(vasya, gt);
        view.viewPartners(irina, gt);
        view.viewPartners(petr, gt);
    }
}
