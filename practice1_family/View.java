package org.example.practice1_family;

public class View {
    public void viewChildren(Person p, GeoTree gt) {
        System.out.printf("%s: дети - ", p.getFullName());
        System.out.println(new Research(gt).getChildren(p));
    }

    public void viewParents(Person p, GeoTree gt) {
        System.out.printf("%s: родители - ", p.getFullName());
        System.out.println(new Research(gt).getParents(p));
    }

    public void viewPartners(Person p, GeoTree gt) {
        System.out.printf("%s: супруги - ", p.getFullName());
        System.out.println(new Research(gt).getPartners(p));
    }

    public void viewSiblings(Person p, GeoTree gt) {
        System.out.printf("%s: братья и сестры. По любому из родителей - ", p.getFullName());
        System.out.println(new Research(gt).getSiblings(p));
    }
}
