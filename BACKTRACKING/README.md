# Backtracking in Java

This folder contains my Java implementations of common **Backtracking** problems.  
I am solving these problems to strengthen my understanding of recursion, decision trees, and algorithmic problem solving for coding interviews and placements.

---

## Topics Covered

- Array Backtracking
- Generate Subsets
- Generate Permutations
- N-Queens (Coming Soon)
- Sudoku Solver
- Rat in a Maze (Coming Soon)
- Word Search (Coming Soon)

---

## 1. Array Backtracking

### Problem
Fill an array recursively and then modify its values while returning from recursion using backtracking.

### Concepts Learned

- Recursion
- Base Case
- Recursive Calls
- Backtracking Step
- Changing state while returning

### Time Complexity

- **O(n)**

### Space Complexity

- **O(n)** (Recursion Stack)

---

## 2. Generate Subsets

### Concepts Learned

- Include / Exclude Technique
- Decision Tree
- Power Set Generation
- Recursive Backtracking

### Time Complexity

- **O(2ⁿ)**

### Space Complexity

- **O(n)**

---

## 3. Generate Permutations

### Concepts Learned

- Swapping Elements
- Backtracking
- Recursive Tree
- Restoring Original State

### Time Complexity

- **O(n × n!)**

### Space Complexity

- **O(n)**

---

## 4. Sudoku Solver

### Concepts Learned

- Constraint Checking
- Row Validation
- Column Validation
- 3×3 Grid Validation
- Recursive Backtracking

### Time Complexity

- Worst Case: **O(9^(n²))**

### Space Complexity

- **O(n²)**

---

## What I Learned

- Backtracking is an extension of recursion.
- We first make a choice.
- We recursively solve the remaining problem.
- We undo the choice (backtrack) before exploring another possibility.
- Backtracking is useful for exploring all possible solutions efficiently.

---

## Folder Structure

```
BACKTRACKING/
│
├── ArrayBacktrack.java
├── Subsets.java
├── Permutations.java
├── SudokuSolver.java
└── README.md
```

---

## Sample Output (Array Backtracking)

```
1 2 3 4 5
-1 0 1 2 3
```

---

## Technologies

- Java
- IntelliJ IDEA / Eclipse
- Git & GitHub

---

## Author

**Papiya Dutta**

- GitHub: https://github.com/Papiya005
- LeetCode: https://leetcode.com/u/Papiya005/