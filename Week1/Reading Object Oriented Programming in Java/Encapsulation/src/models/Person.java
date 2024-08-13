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