/*A base class Animal with a method eat() that prints a message.
1.	Create a subclass Dog that inherits from Animal and includes an additional method bark() that prints a message.
2.	In a Main class, create an object of the Dog class and call both the eat() method (inherited from Animal) and the bark() method (defined in Dog).
ANSWER:*/
class Animal
{
    String a;
    public void eat()
    {
        System.out.println("eat the dog");
    }
}
class Dog extends Animal
{
    String b;
    public void bark()
    {
        System.out.println("bark the dog");
    }
}
class Main {
    public static void main(String[] args) {
        Dog s1 = new Dog();
        s1.eat();
        s1.bark();
    }
}
