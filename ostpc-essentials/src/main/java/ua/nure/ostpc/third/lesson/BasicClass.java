package ua.nure.ostpc.third.lesson;

public class BasicClass {
    public double myProperty;

    public BasicClass() {
        System.out.println(myProperty);
    }

    public static void main(String[] args) {
        BasicClass clazzInstance = new BasicClass();
        Car car = new Car();
        Car car1 = new Car();
        car.doSomething();
        car.printPi();
        car1.printPi();
    }
}

class Car {
    public String number = "AX 1485 BO";
    public int doors = 4;
    public double price = 12123123.22;

    public double PI = 3.14;

    public void doSomething() {
        System.out.println(this.number);
        System.out.println(this.doors);
        System.out.println(this.price);
        this.PI = 3.1415;
    }

    public void printPi() {
        System.out.println(PI);
    }
}


/*
Show how to create a constructor
Show how to achieve constructor chain
Show what is a default constructor
Declare different properties
Set default values for properties
Change some values in constructors
Get values via methods
Declare a static constant and set it the value
 */
class Sweet {
    public static String distributor = "Sweet distributor";
    public float price;
    public String name;
    public boolean isChocolate;
}