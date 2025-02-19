package simuladores;

//Base class defining a generic getValue method
class Base {
 public Object getValue() { 
     return new Object(); 
 }
}

//Derived class extending Base and overriding getValue
//Note: This is a covariant return type - String is a subtype of Object
class Base2 extends Base {
 public String getValue() { 
     return "hello"; 
 }
}

//Test class to demonstrate the inheritance and polymorphism
public class TestClass {
 public static void main(String[] args) {
     // Creating Base2 object but referring to it through Base reference
     // This demonstrates polymorphism - the actual method called
     // will be determined at runtime
     Base b = new Base2();
     System.out.println(b.getValue()); // Will print "hello"
 }
}