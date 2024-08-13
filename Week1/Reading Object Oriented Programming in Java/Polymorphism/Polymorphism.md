# Polymorphism
Polymorphism generally describes the phenomenon that a syntax may have different meanings in different contexts. In Java, this is achieved via method overloading and dynamic binding.

Method overloading is the process of defining multiple methods with the same name, but different parameters (resulting in different method signatures). We have seen an example of method overloading in the previous example, where we have defined two constructors for the Person class, one with parameters, and one without parameters, like:
```
    // Default constructor method for the Person class
    public Person() {
    }

    // Overloaded constructor method for the Person class
    public Person(String name) {
        setName(name);
    }
```
When a method is called, the compiler will determine which method to call based on the method signature. Whether method overloading is considered 'true' polymorphism is a matter of debate.

In OOP, the terms 'polymorphism' usually refers to dynamic binding, which is the process of determining which method to call at runtime. This is achieved through method overriding, which is the process of redefining a method in a subclass. We have seen this in the Student class, where we have overridden the getName method of the Person class, and prepended the string "Student: " to the name:
```
    @Override
    public String getName() {
        return "Student: " + super.getName();
    }
```
We observe that the variable student has been declared as a Person object, but is assigned a Student object (a process called upcasting). At run time, the Java Virtual Machine will determine that the getName method of the Student class should be called, and the string "Student: " will be prepended to the name.
```
Person person = new Person("John Doe");
System.out.println(person.getName()); // Prints "John Doe"

Person student = new Student("John Doe", new String[] {"Math", "Science"});
System.out.println(student.getName()); // Prints "Student: John Doe"
```
In the example above, the person variable is of type Person, and the student variable is of type Student. However, since Student inherits from Person, the student variable can also be treated as a Person object.

Virtual Methods and the "@Override" Annotation

If you have programmed in C# before, you may be familiar with the concept of virtual methods. In C#, methods are non-virtual by default, and must be explicitly marked as virtual to allow them to be overridden.

In Java, methods are virtual by default, and must be explicitly marked as final to prevent them from being overridden.

Additionally, you may have noticed the use of the @Override symbol before the getName method in the Student class. This is called an annotation, and is used to provide additional information about the method. In this case, the @Override annotation is used to indicate that the getName method overrides the getName method of the superclass. This is not necessary, but is good practice, as it allows the compiler to check that the method signature matches the method that is being overridden (in case of a typo). 