# Encapsulation
Encapsulation is the process of packaging data with the methods that operate on that data. This is usually accompanied by information hiding, preventing access to the internal data from the outside world.

In Java, encapsulation is achieved by using access modifiers to control the visibility of attributes and methods. The four access modifiers in Java are public, protected, private, and the default access modifier (no access modifier). The default access modifier is used when no access modifier is specified. The following table shows the visibility of attributes and methods for each access modifier.

private	Default	protected	public
Same class	Yes	Yes	Yes	Yes
Same package subclass	No	Yes	Yes	Yes
Same package non-subclass	No	Yes	Yes	Yes
Different package subclass	No	No	Yes	Yes
Different package non-subclass	No	No	No	Yes
It is good practice to make all attributes private, and provide getter and setter methods to access and modify the attributes, if necessary. When applicable, the setter methods should perform validation on the input, to ensure that the data is always in a valid state.

For example, let's say we have a Person class inside a models package (we'll get back to this in a bit) that represents a person, and has a name attribute. We can make the name attribute private, and provide a getName method to get the name, and a setName method to set the name. The setName method can perform validation to ensure that the name is not empty.

In IntelliJ IDEA, to create a new package, right click on the src folder, and click on New -> Package. To create a new class in a package, right click on the package, and click on New -> Java Class.

 
```
package models;

public class Person {
    // The name attribute is private, so it cannot be accessed from outside the class
    private String name;

    // Default constructor method for the Person class
    public Person() {
    }

    // Overloaded constructor method for the Person class
    public Person(String name) {
        setName(name);
    }

    // The getter method for the name attribute
    public String getName() {
        return name;
    }

    // The setter method for the name attribute
    // with validation to ensure that the name is not empty
    public void setName(String name) {
        if (name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
    }
}

```

Java provides an additional layer of encapsulation, called packages. A package is a collection of classes, and can be used to group related classes together. The classes in a package can be accessed by other classes in the same package, but not by classes in other packages. This is useful for hiding implementation details, and preventing name clashes (two classes can have the same name, as long as they are in different packages).

As previously mentioned, classes in the same package can access each other without additional steps. However, if you wish to use classes from another package, they must be imported using the import statement, either individually, or as a whole package.

```
// Import a single class
import models.Person;

// Import all classes in the models package
import models.*;
```

For example, if we have a Person class in the models package, and an Example class in the default package (located in the root folder), we can access the Person class as follows:
```
import models.Person;

class Example {
    public static void main(String[] args) {
        // Create an empty Person object and use 
        // the setter method to set the name
        Person person = new Person();
        person.setName("John Doe");
        System.out.println(person.getName());

        // Equivalently, we can use the constructor method
        Person person2 = new Person("John Doe");
        System.out.println(person2.getName());
    }
}
```
Packages and Directories

In Java, packages are mapped to directories. For example, if we have a Person class in the models package, the Person class must be located in the models directory. If we have an Example class in the default package, the Example class must be located in the root directory.

While it is possible to simply contain every class in the default package, it is good practice to use packages to organise your classes, as part of the encapsulation principle.