# Linked List

This folder contains my **Java implementation and practice of Linked List data structures**.

## Topics Covered

* Node creation
* Constructor in Node
* Head and Tail
* Understanding references
* Adding a node at the beginning
* Adding a node at the end
* Handling an empty linked list
* Connecting nodes using the `next` reference

## Implementations

### 1. Add First

A new node is added at the beginning of the linked list.

```java
newNode.next = Head;
Head = newNode;
```

Example:

```text
Before:
10 → 20 → 30 → null

After addFirst(5):
5 → 10 → 20 → 30 → null
```

### 2. Add Last

A new node is added at the end of the linked list.

```java
Tail.next = newNode;
Tail = newNode;
```

Example:

```text
Before:
10 → 20 → 30 → null

After addLast(40):
10 → 20 → 30 → 40 → null
```

## Empty List

When the linked list is empty, both `Head` and `Tail` point to the newly created node.

```java
Head = Tail = newNode;
```

Example:

```text
Head
 ↓
[10] → null
 ↑
Tail
```

## Key Concept: References

The `next` variable stores a **reference to another Node**, not the node's data value.

For example:

```java
Tail.next = newNode;
```

means that the current last node now points to the new node.

## Current Files

* `basic.java` — Adding nodes at the beginning
* `addlast.java` — Adding nodes at the end

## Example

```java
ll.addLast(98);
ll.addLast(99);
ll.addLast(100);
ll.addLast(200);
```

Result:


```text
98 ->99 ->100 → 200 → null
```

## Language

* Java

## Learning Goal

This implementation is part of my **Data Structures and Algorithms practice**.
