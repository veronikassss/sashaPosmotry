### Detailed Technical Task: Simple Calculator Interface

#### **Objective:**
Create a simple calculator system that performs basic arithmetic operations using an interface-based approach. The project will demonstrate encapsulation of behavior through interfaces, dynamic switching of operations, and polymorphism in Java.

#### **Requirements Overview:**

1. **Define an Interface:**
    - Create an `Operation` interface.
    - The interface should declare a method:
        - `calculate(double a, double b)`: This method will take two `double` parameters and return a calculated result.

2. **Implementing Classes:**
    - Implement the `Operation` interface in at least four classes, each representing a basic arithmetic operation:
        - **Addition**: Implements `calculate()` to add two numbers and return the result.
        - **Subtraction**: Implements `calculate()` to subtract the second number from the first and return the result.
        - **Multiplication**: Implements `calculate()` to multiply two numbers and return the result.
        - **Division**: Implements `calculate()` to divide the first number by the second and return the result. Handle potential division by zero errors gracefully.

3. **Main Program to Demonstrate Functionality:**
    - Create a main class that acts as the entry point for the calculator application.
    - In the main method:
        - Instantiate objects for each arithmetic operation (`Addition`, `Subtraction`, `Multiplication`, `Division`).
        - Prompt the user to input two numbers.
        - Allow the user to select an operation (addition, subtraction, multiplication, or division).
        - Use the appropriate `Operation` implementation to perform the calculation based on user selection.
        - Display the result of the calculation.

4. **Polymorphism Demonstration:**
    - Utilize polymorphism by referring to instances of different operation classes through the `Operation` interface.
    - Demonstrate how the same interface reference can invoke different behaviors based on the actual object type (e.g., switching between addition and subtraction dynamically).

#### **Optional Enhancements:**
- Add additional operations such as `Modulo`, `Exponentiation`, or other mathematical functions by creating new classes that implement the `Operation` interface.
- Implement a simple input validation mechanism to ensure the input is numeric and to handle edge cases gracefully (e.g., division by zero).
- Provide a loop that allows users to perform multiple calculations in a single session.

#### **Expected Program Behavior:**
- The user should be able to perform basic arithmetic operations by entering two numbers and selecting the desired operation.
- The program should display the result of the selected operation.
- Example interaction:
  ```
  Enter first number: 10
  Enter second number: 5
  Select operation: (1) Addition, (2) Subtraction, (3) Multiplication, (4) Division
  You selected: 1 (Addition)
  Result: 15.0
  ```

#### **Focus Areas:**
- **Encapsulation of Behavior**: Encapsulate different arithmetic operations using separate classes implementing a common interface.
- **Polymorphism**: Use the `Operation` interface as a common type to reference different implementations and demonstrate dynamic behavior switching.
- **Separation of Concerns**: Design a system that separates user input handling, operation selection, and result calculation.

#### **Deliverables:**
- An `Operation` interface with a `calculate(double a, double b)` method.
- Four implementing classes (`Addition`, `Subtraction`, `Multiplication`, `Division`) with unique implementations for the `calculate()` method.
- A main program that handles user input, selects the appropriate operation, and displays the result based on user input.