# OOP - Object Oriented Programming

OOP is a way to structure programs using classes and objects, enabling code reusability, modularity, and better organization.

## Class 
Class is a detailed description, the definition, and the template of what an object will be. But it is not the object itself, think of it as a blueprint of an object. Classes are usually written into separate files with the same name as the class itself. E.g. Square.java class could look like this:

    public class Square {
    
        private int edgeLength;

        public Square() {
            this.edgeLength = 5;
        }

        public Square(int edgeLength) {
            this.edgeLength = edgeLength;
        }
    
        public int getEdgeLength() {
            return edgeLength;
        }
    
        public void setEdgeLength(int edgeLength) {
            this.edgeLength = edgeLength;
        }
    
        public int calculatePerimeter() {
            final int perimeter = edgeLength * 4;
            return perimeter;
        }
    
        public void extendEdge(int extendBy) {
            edgeLength = edgeLength + extendBy;
        }
    }

### Syntax explanation:

- **Class declaration**:

      public class Square {
  - `public` - Access modifier, classes usually have public modifier.
  - `class` - Defining what we are declaring.
  - `Square` - Defining name of a class.
- **Instance Variables** - variables which are usually created and destroyed with an object. Each object has its own values in instance variables.
  
      private int edgeLength;
  - `private` - Access modifier, instance variables usually have private modifier. We use "setters"/"getters" to control these variables.
  - `int` - Type of instance variable.
  - `edgeLength` - Name of this instance variable

- **Constructors** - a way to initialize object of this class. It is possible to have more than one constructor, however in that case each constructor has to accept either different number of arguments or arguments have to be of different type.

      public Square(int edgeLength) {
          this.edgeLength = edgeLength;
      }
  - `public` - Access modifier, constructors usually have public modifier.
  - `Square` - The name of class, based on which this constructor will create an object.
  - `(int edgeLength)` - Place where we define what arguments constructor needs to initialize our class. In this case it expects to get `edgeLength` argument of type `int`.
  - `this.edgeLength = edgeLength` - `this` is a keyword which points to the object which is being created (i.e. `this.edgeLength` points to the **instance variable** of this object which we defined earlier). This line will set our object's instance variable `edgeLength` to the value passed in the constructor.

- **Methods** - A block of code inside a class that defines some behavior or action the object can perform.
     
      public int calculatePerimeter() {
          final int perimeter = edgeLength * 4;
          return perimeter;
      }
  - `public int calculatePerimeter()` - Declaration of method
    - `public` - Access modifier (possible values `private`, `public`, `protected`)
    - `int` - Type which this method will return (if method doesn't return anything, type will be `void`)
    - `calculatePerimeter()` - Name of a method. This method doesn't accept any arguments, but if it would, they would need to be declared in `()` (see method `extendEdge`, which accepts one argument `extendBy`)
  - `final int perimeter = edgeLength * 4;` - Declaration of **local variable** with name `perimeter`. Local variables are created when we enter method or constructor and are destroyed after exiting them.
    
    - `final` - means that this variable will not be able to change after being initialized.
  - `return perimeter;` - return statement. Defined what this method will return to the caller.

## Object creation
    Square square1 = new Square(3);
    Square square2 = new Square();

## Interfaces

Similar to a class, however used only for defining methods, without an actual implementation logic.

    public interface Vehicle {
        void drive();
    }

Other classes can `implement` interfaces, which means that they will have to write logic for all methods defined in that interface. E.g. here class `SimpleCar` is implementing interface `Vehicle` so it has to define logic for method `drive()`:

    public class SimpleCar implements Vehicle {

        private int speed;
    
        public SimpleCar(int speed) {
            this.speed = speed;
        }
    
        public void drive() {
            System.out.println("we are driving a car");
        }
        
        public int getSpeed() {
            return this.speed;
        }

    }

Now (in Main.java) we can create a `Vehicle` type object, which will only have access to methods defined in `Vehicle` interface:

    Vehicle simpleCar = new SimpleCar(20);
    simpleCar.drive();

However, `SimpleCar` also has a method `getSpeed()`, in order to access this method now, we need to cast our `simpleCar` object into `SimpleCar` class.

    System.out.println("This is simpleCar speed: " + ((SimpleCar) simpleCar).getSpeed());

Casting can only be used on objects which class you actually know! Otherwise, you will encounter a runtime error. E.g. we couldn't cast `Square` class onto our `simpleCar` object, it wouldn't work! `(Square) simpleCar` will throw error!

## Extending classes

It is possible to extend one class behaviour, to another class. In such structure the class which is extended is called a `superclass` and its methods can be accessed with keyword `super`. E.g. of a class which is accessing its super class constructor:
    
    public class FuelCar extends Car {
    
        public FuelCar(int speed) {
            super(speed);
        }

    }

By extending another class you are inheriting all its variables and methods, so that they could be reused. It is also possible to overwrite some methods if they need custom logic.

## Abstract classes

Abstract class is a class which is half interface, half normal class - it has some methods with defined logic and some abstract methods which have no logic. Those methods will need to be implemented in classes which extend this abstract class. We cannot create objects based on abstract classes, objects are created only based on classes which extend abstract ones.

    public abstract class AbstractCar implements Vehicle {
    
        private int speed;
    
        public AbstractCar(int speed) {
            this.speed = speed;
        }
    
        public void drive() {
            System.out.println("we are driving a car");
        }
    
        public abstract void refuel();
    
    }

In this example we have abstract method `refuel()` which will need to be implemented by classes extending `AbstractCar`. E.g.:

    public class FuelCar extends AbstractCar {
    
        public FuelCar(int speed) {
            super(speed);
        }

        public void refuel() {
            System.out.println("Filling up with gasoline");
        }
    }

Now we  can initialize objects of `AbstractCar` type (keep in mind that we are using constructor of `ElectricCar` to initialize `AbstractCar`, because abstract classes cannot be initialized on its own!):

    AbstractCar electricCar = new ElectricCar(500);
    electricCar.drive();
    electricCar.refuel();

## Static variables

These are variables which are tied to the class and not the object! E.g. `numberOfWheels` in this class:

    public class ElectricCar extends AbstractCar {
    
        public static int numberOfWheels = 4;
    
        private int batteryPercentage;
    
        public ElectricCar(int speed) {
            super(speed);
        }
    
        public void refuel() {
            System.out.println("Charging battery");
        }
    
    }

Now we can access `numberOfWheels` without even creating an object:

    System.out.println(ElectricCar.numberOfWheels)













