# Java Linked List and Node Recreation

This GitHub repository contains a Java implementation of a singly linked list (`IntList`) and its corresponding node (`Node`). These data structures allow you to work with a dynamic collection of integers. The repository also includes a `Test` class to demonstrate how to use these classes.

## Files

### `IntList.java`

`IntList` is the main class representing a singly linked list of integers. It contains methods for adding, removing, setting, and printing elements in the list, among other functionalities.

### `Node.java`

`Node` represents individual nodes in the linked list. Each node contains an integer value (`cargo`) and a reference to the next node (`next`). The `Node` class includes methods for printing nodes, printing nodes backward, and removing the second node from a list.

### `Test.java`

`Test` is a testing class that demonstrates the usage of `IntList` and `Node` methods. It includes various test cases to validate the functionality of the linked list and node classes.

## How to Use

1. Clone the repository to your local machine.

   ```bash
   git clone <repository_url>

2. Open the repository in your Java development environment (e.g., IntelliJ IDEA, Eclipse).

3. Run the Test class to execute the provided test cases. You can also modify or create your own test cases in this class.

4. Explore the IntList and Node classes to understand their implementations and how they interact.

## Detailed Explanation
The IntList class represents a singly linked list. It includes methods for adding, removing, and modifying elements within the list. Here's a summary of its main methods:

addFirst(int i): Adds an integer to the beginning of the list.
removeFirst(): Removes the first element from the list.
set(int index, int c): Sets the value of the element at a specified index.
add(int index, int cargo): Inserts an integer at the specified index.
addLast(int cargo): Appends an integer to the end of the list.
reverse(): Reverses the order of elements in the list.
append(IntList a): Appends another IntList to the end of the current list.
findNode(int index): Returns the node at the specified index.
checkLength(): Checks if the list length matches the number of nodes in the list.

The Node class represents individual nodes in the linked list. Each node contains an integer value (cargo) and a reference to the next node (next). Key methods include:

printList(): Prints the list of nodes starting from the current node.
printBackward(Node list): Prints the list of nodes in reverse order.
printBackwardsNicely(Node list): Prints the list of nodes in a formatted reverse order.
removeSecond(Node list): Removes the second node from the list.

The Test class demonstrates how to use these classes by providing various test cases for each method, helping you understand their functionality and usage.

Feel free to explore, modify, and extend these classes to suit your specific needs for working with linked lists in Java.
