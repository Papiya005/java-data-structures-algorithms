# ArrayList in Java

## Introduction

`ArrayList` is a resizable array provided by the Java Collections Framework. Unlike normal arrays, an `ArrayList` can grow and shrink dynamically as elements are added or removed.

**Package:**

```java
import java.util.ArrayList;
```

---

## Creating an ArrayList

```java
ArrayList<Integer> list = new ArrayList<>();
```

---

## Basic Operations

### 1. Add Elements

```java
list.add(10);
list.add(20);
list.add(30);
```

---

### 2. Get an Element

```java
System.out.println(list.get(1));
```

Output:

```
20
```

---

### 3. Update an Element

```java
list.set(1, 50);
```

Output:

```
[10, 50, 30]
```

---

### 4. Remove an Element

```java
list.remove(0);
```

Output:

```
[50, 30]
```

---

### 5. Size of ArrayList

```java
System.out.println(list.size());
```

---

### 6. Check if an Element Exists

```java
System.out.println(list.contains(30));
```

---

## Traversing an ArrayList

```java
for (int i = 0; i < list.size(); i++) {
    System.out.print(list.get(i) + " ");
}
```

---

## Reverse Traversal

```java
for (int i = list.size() - 1; i >= 0; i--) {
    System.out.print(list.get(i) + " ");
}
```

---

## Find Maximum Element

```java
int max = Integer.MIN_VALUE;

for (int i = 0; i < list.size(); i++) {
    if (list.get(i) > max) {
        max = list.get(i);
    }
}

System.out.println(max);
```

---

## Find Minimum Element

```java
int min = Integer.MAX_VALUE;

for (int i = 0; i < list.size(); i++) {
    if (list.get(i) < min) {
        min = list.get(i);
    }
}

System.out.println(min);
```

---

## Common Methods

| Method       | Description                      |
| ------------ | -------------------------------- |
| `add()`      | Adds an element                  |
| `get()`      | Returns the element at an index  |
| `set()`      | Updates an element               |
| `remove()`   | Removes an element               |
| `size()`     | Returns the number of elements   |
| `contains()` | Checks whether an element exists |
| `isEmpty()`  | Checks whether the list is empty |
| `clear()`    | Removes all elements             |

---

## Time Complexity

| Operation        | Time Complexity  |
| ---------------- | ---------------- |
| `add()` (at end) | O(1) (amortized) |
| `get()`          | O(1)             |
| `set()`          | O(1)             |
| `remove(index)`  | O(n)             |
| `add(index)`     | O(n)             |
| `contains()`     | O(n)             |
| `size()`         | O(1)             |

---

## Practice Problems

* Print all elements.
* Reverse an ArrayList.
* Find the maximum element.
* Find the minimum element.
* Swap two elements.
* Reverse the ArrayList.
* Sort an ArrayList.
* Search for an element.
* Remove duplicate elements.
* Find the second largest element.

---

## Key Takeaways

* `ArrayList` is a dynamic array.
* It stores objects, not primitive types (use wrapper classes like `Integer`).
* Accessing elements by index is fast: **O(1)**.
* Inserting or deleting elements in the middle requires shifting elements, so it takes **O(n)** time.
