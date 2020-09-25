package ru.mirea.Yana.lab3;

public class main {
    public static void main(String[] args) {
        Circle circle1 = new Circle("blue", true, 5);
        Rectangle rec1 = new Rectangle("red", true, 10, 5);
        Square square1 = new Square(15, "yellow", false);
        System.out.printf(circle1.toString() + "\n" + rec1.toString() + "\n" + square1.toString());
    }
}