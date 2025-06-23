/*QUESTION FOR MULTI LEVEL INHERITANCE  
1. Device (Base class):
Attribute: brand (e.g., Samsung, Apple)
Does not have a constructor
This attribute will be accessed and initialized by subclasses
2. Phone (Inherits from Device):
Adds: number (the phone number as a String)
No constructor
Inherits brand from Device
3. SmartPhone (Inherits from Phone):
Adds: operatingSystem (e.g., Android, iOS)
Implements a method setDetails(String brand, String number, String operatingSystem) to assign all attributes
Implements a method displayDetails() to print all details of the smartphone*/

class Device
{
    String Brand;
}
class Phone extends Device
{
    String Phoneno;
}
class Smartphone extends Phone
{
    String Operatingsystem;
    public void setdetails(String Brand, String Phoneno, String Operatingsystem)
    {
        this.Brand = Brand;
        this.Phoneno = Phoneno;
        this.Operatingsystem = Operatingsystem;
    }
    public void Displaydetails()
    {
        System.out.println("Brand: "+ Brand);
        System.out.println("Phoneno: "+ Phoneno);
        System.out.println("Operatingsystem: "+ Operatingsystem);
    }
}
class Main {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone();
        s1.setdetails("samsung", "999", "android");
        s1.Displaydetails();
    }
}
