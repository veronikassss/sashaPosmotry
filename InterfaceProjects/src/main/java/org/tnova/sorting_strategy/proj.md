### Detailed Technical Task: Sorting Strategy Project

#### **Objective:**
Create a sorting system that supports multiple sorting algorithms using interfaces. This project demonstrates how interfaces can be used to encapsulate different sorting strategies, providing flexibility and enabling dynamic switching between implementations.

#### **Requirements Overview:**

1. **Define an Interface:**
    - Create a `SortingAlgorithm` interface.
    - The interface should declare a method:
        - `sort(int[] numbers)`: This method takes an array of integers and sorts it in-place.

2. **Implementing Classes:**
    - Implement the `SortingAlgorithm` interface with at least two different sorting algorithms:
        - **BubbleSort**: Implements the `sort()` method using the Bubble Sort algorithm.
        - **QuickSort**: Implements the `sort()` method using the Quick Sort algorithm.
    - Optionally, you can add more sorting algorithms like `InsertionSort` or `MergeSort` for additional practice.

3. **Main Program to Demonstrate Functionality:**
    - Create a main class to act as the entry point for the sorting application.
    - In the main method:
        - Prompt the user to input an array of integers to be sorted.
        - Allow the user to select the desired sorting algorithm (e.g., Bubble Sort or Quick Sort).
        - Instantiate the selected sorting algorithm and sort the input array.
        - Display the sorted array.

4. **Polymorphism Demonstration:**
    - Utilize polymorphism by referencing sorting algorithm instances through the `SortingAlgorithm` interface.
    - Show how the sorting behavior can be switched dynamically at runtime by changing the algorithm selection.

#### **Optional Enhancements:**
- Implement a `Sorter` class that accepts a `SortingAlgorithm` object and uses it to perform the sorting. This can demonstrate the Strategy Pattern more explicitly.
- Allow the user to input arrays of different sizes and values for more thorough testing.
- Measure and display the execution time for each sorting algorithm to highlight performance differences.

#### **Expected Program Behavior:**
- The user should be able to input an array of integers and select a sorting algorithm.
- The program should display the sorted array using the chosen algorithm.
- Example interaction:
  ```
  Enter the number of elements: 5
  Enter the elements: 34 7 23 32 5
  Select sorting algorithm:
  1. Bubble Sort
  2. Quick Sort
  You selected: 1 (Bubble Sort)
  Sorted array: 5 7 23 32 34
  ```

#### **Focus Areas:**
- **Encapsulation of Behavior**: Encapsulate different sorting algorithms using separate classes that implement a common interface.
- **Polymorphism**: Use the `SortingAlgorithm` interface to enable dynamic selection and invocation of sorting behaviors.
- **Flexibility and Extendability**: Demonstrate how adding new sorting algorithms only requires creating a new class that implements the `SortingAlgorithm` interface, without modifying existing code.

#### **Deliverables:**
- A `SortingAlgorithm` interface with a `sort(int[] numbers)` method.
- At least two implementing classes (`BubbleSort`, `QuickSort`) with different sorting strategies.
- A main program that handles user input, selects the sorting algorithm, and sorts the array using the selected strategy.