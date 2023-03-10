/** Abstract class:
 * To define an abstract method in a class, that class must be defined as an abstract class with abstract
 * keyword. If I use abstract method, ide will ask me to define the class as an abstract or implement tha abstract
 * method(i.e, add some functiom body by inheriting from an abstract class.)*/

abstract public class Shape {
    public float pi;

    {
        pi = 3.14F;
    }

    abstract public float area();
}
