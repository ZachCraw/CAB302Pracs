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