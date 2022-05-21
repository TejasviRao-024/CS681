package edu.umb.cs681.hw10;

public class Main {
	
	public static void main(String[] args) {
        Position p1 = new Position(50.8228745, -85.1805800, 40);
        Position p2 = new Position(55.8228745, -88.1805800, 40);
        Position p3 = new Position(55.82287, -88.1805800, 40);

        System.out.println(p1.distanceTo(p2));
        System.out.println(p2.equals(p3));

        System.out.println(p1.changeLat(50.45342));
        System.out.println(p1.changeLong(-80.45454));
        System.out.println(p1.changeAlt(90));
    }

}
