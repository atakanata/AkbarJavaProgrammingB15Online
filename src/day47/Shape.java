package day47;

public abstract class Shape {

    String name;
    int area;

    // add a constructor to set this name value
    public Shape(String name) {
        this.name = name;
    }

    // add a abstract void method called calculateArea
    public abstract void calculateArea();

    // I want to enforce sub classes to provide toString method !!!!
    public abstract String toString();

}


//  add two concrete class of Shape :
//  Triangle
//      instance fields : int height and base

// constructor
//        to set name(you may use super class constructor) , height , base

//        implements calculateArea method   area = height * base / 2

// add toString method

//
//  Rectangle
//      instance fields : width and height

//      implements calculateArea method   area = height * width
//      add toString method