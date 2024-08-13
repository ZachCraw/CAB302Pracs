# Inheritance
Inheritance is the process of creating a new class from an existing class, and inheriting the attributes and methods of the existing class. The new class is called a subclass, and the existing class is called a superclass. The subclass can add new attributes and methods, and override existing methods.

In Java, inheritance is achieved using the extends keyword. For example, if we have a Person class, and we want to create a Student class that inherits from the Person class, we can do so as follows:
 
```
package models;

public class Student extends Person {
    // The Student class inherits the attributes and methods of the Person class

    // The Student class can add new attributes and methods
    private String[] courses;

    // To inherit constructors, it is necessary to define a constructor
    // and use the super keyword to call the superclass constructor
    public Student(String name, String[] courses) {
        super(name);
        for (String course : courses) {
            addCourse(course);
        }
    }

    // If the default constructor is also needed, it must be re-declared
    public Student() {
        super();
    }

    // The Student class can override existing methods
    // and call the superclass method using the super keyword
    @Override
    public String getName() {
        return "Student: " + super.getName();
    }

    // The Student class can also add new methods
    public String[] getCourses() {
        return courses;
    }

    public void addCourse(String course) {
        // Add the course to the courses array
        // with some validation
    }
}
```

The super keyword is used to access the superclass, including its attributes and methods (except for private attributes and methods). For example, the getName method of the Student class calls the getName method of the Person class, and prepends the string "Student: " to the name.

Inheriting Constructors

When there are multiple constructors in the base class, and the subclass does not define any constructors, then the subclass will only inherit the default constructor (one without parameters) of the base class. To inherit the other constructors, the subclass can define a constructor that calls the superclass constructor using the super keyword, such as in the example above.

If another constructor is defined, and you wish to use the default constructor, i.e., Student student = new Student();, you will need to re-declare the default constructor in the subclass, and call the superclass constructor using the super keyword.

Although not recommended, the constructors in the subclass may choose not too call the superclass constructor, but in this case, the superclass attributes may not be initialised properly.