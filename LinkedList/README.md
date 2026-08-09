# Linked List

This folder contains my **Java implementation and practice of Linked List data structures**.

## Topics Covered

* Node creation
* Constructor in Node
* Head and Tail
* Adding a node at the beginning
* Understanding node references
* Connecting nodes

## Current Implementation

The `basic.java` file currently demonstrates how to:

1. Create a `Node`.
2. Create the first node.
3. Maintain `Head` and `Tail`.
4. Add a new node at the beginning of the linked list.
5. Connect the new node with the existing list.

### Example

After:

```java
ll.firstAdd(10);
ll.firstAdd(20);
```

The linked list becomes:

```text
20 → 10 → null
```

## Key Concept

When adding a node at the beginning:

```java
newNode.next = Head;
Head = newNode;
```

The first statement connects the new node to the existing list, and the second statement makes the new node the new `Head`.

## Language

* Java

## Learning Goal

This implementation is part of my **Data Structures and Algorithms practice**.
