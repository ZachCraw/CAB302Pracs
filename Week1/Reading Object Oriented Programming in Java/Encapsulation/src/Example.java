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