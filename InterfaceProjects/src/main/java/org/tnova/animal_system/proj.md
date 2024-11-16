### Detailed Technical Task: Animal Sound System

#### **Objective:**
Create a system that simulates different animal sounds using an interface. This project aims to enhance your understanding of interfaces, polymorphism, and behavior abstraction in Java.

#### **Requirements Overview:**

1. **Define an Interface:**
    - Create an `Animal` interface.
    - The interface should declare a method `makeSound()` that each implementing class must define.

2. **Implementing Classes:**
    - Implement the `Animal` interface in at least three classes:
        - **Dog**: Represents a dog with a unique implementation of the `makeSound()` method (e.g., simulating barking).
        - **Cat**: Represents a cat with its unique sound (e.g., meowing).
        - **Cow**: Represents a cow with a specific sound (e.g., mooing).
    - Each class should provide its own specific behavior when `makeSound()` is called.

3. **Main Program to Demonstrate Functionality:**
    - Create a main class to act as the entry point for the program.
    - Within the main method, perform the following:
        - Instantiate objects of each animal type.
        - Store these objects in a collection (e.g., an array or list) of type `Animal`.
        - Use a loop to iterate over the collection and call the `makeSound()` method for each animal, demonstrating polymorphism.

4. **Polymorphism Demonstration:**
    - Show how different implementations of the `makeSound()` method are invoked based on the runtime object type, even though the interface type `Animal` is used as a reference.
    - Emphasize that adding new animal types only requires creating a new class that implements the `Animal` interface without modifying existing code.

#### **Optional Enhancements:**
- Add additional methods to the `Animal` interface (e.g., `move()` or `eat()`) to further explore interface capabilities and demonstrate multiple behaviors.
- Create additional animal classes (e.g., `Bird`, `Sheep`, `Lion`) with unique sounds and behaviors.
- Implement input handling to allow users to select which animal’s sound to make.

#### **Expected Program Output:**
- When the program runs, it should display each animal's specific sound. For example:
  ```
  Dog barks: Woof Woof!
  Cat meows: Meow!
  Cow moos: Moo!
  ```

#### **Focus Areas:**
- **Understanding Interfaces**: Learn how to define and implement interfaces to specify behavior contracts.
- **Polymorphism**: Practice using a single interface type to refer to different object types, demonstrating runtime behavior changes.
- **Behavior Separation**: Gain experience creating modular, extendable components by separating behavior into distinct classes that adhere to a common interface.

#### **Deliverables:**
- A defined `Animal` interface with at least one method declaration.
- Three implementing classes (`Dog`, `Cat`, `Cow`) that define unique behaviors for the `makeSound()` method.
- A main program that demonstrates interface use, polymorphism, and separation of behavior.