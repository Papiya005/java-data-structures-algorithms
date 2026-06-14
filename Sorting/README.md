# Merge Sort and Quick Sort in Java

## Overview

This project implements two popular Divide and Conquer sorting algorithms in Java:

* **Merge Sort** – Recursively divides the array into smaller subarrays, sorts them, and merges them back together.
* **Quick Sort** – Selects a pivot element, partitions the array around the pivot, and recursively sorts the resulting subarrays.

Both algorithms are fundamental in Data Structures and Algorithms (DSA) and demonstrate the power of recursive problem solving.

---

## Example

### Input

```text
[6, 3, 9, 8, 2, 5]
```

### Output

```text
[2, 3, 5, 6, 8, 9]
```

---

## Merge Sort

### Algorithm

1. Divide the array into two halves.
2. Recursively sort the left half.
3. Recursively sort the right half.
4. Merge the two sorted halves.

### Time Complexity

| Case         | Complexity |
| ------------ | ---------- |
| Best Case    | O(n log n) |
| Average Case | O(n log n) |
| Worst Case   | O(n log n) |

### Space Complexity

```text
O(n)
```

A temporary array is used during the merge process.

---

## Quick Sort

### Algorithm

1. Choose a pivot element.
2. Partition the array around the pivot.
3. Place the pivot in its correct sorted position.
4. Recursively sort the left subarray.
5. Recursively sort the right subarray.

### Time Complexity

| Case         | Complexity |
| ------------ | ---------- |
| Best Case    | O(n log n) |
| Average Case | O(n log n) |
| Worst Case   | O(n²)      |

The worst case occurs when the pivot repeatedly creates highly unbalanced partitions.

### Space Complexity

```text
O(log n)
```

Due to the recursive call stack in the average case.

---

## Merge Sort vs Quick Sort

| Feature            | Merge Sort | Quick Sort |
| ------------------ | ---------- | ---------- |
| Best Case          | O(n log n) | O(n log n) |
| Average Case       | O(n log n) | O(n log n) |
| Worst Case         | O(n log n) | O(n²)      |
| Space Complexity   | O(n)       | O(log n)   |
| Stable             | Yes        | No         |
| In-Place           | No         | Yes        |
| Faster in Practice | Usually No | Often Yes  |

---

## Concepts Used

* Recursion
* Divide and Conquer
* Arrays
* Sorting Algorithms
* Partitioning Technique
* Complexity Analysis

---

## Learning Outcome

This implementation helped me understand:

* Recursive problem solving
* Divide and Conquer strategy
* Array partitioning
* Merging sorted subarrays
* In-place sorting
* Time and space complexity analysis

---

## Author

**Papiya Dutta**
**B.Tech Student | Java & DSA Learner**

Building a professional collection of Data Structures and Algorithms implementations in Java with clean code, explanations, and complexity analysis.
