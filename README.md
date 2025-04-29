# ADS3
# Assignment 3 - HashTable and Binary SearchTree
## Overview

This project contains implementations for:
Given below are a few possibly computer-science-related terms that will enable a neophyte reader to follow the remaining description, making it easier to understand. 

1. `MyHashTable<K, V>` - a generic hash table with chaining (without recursion). 
2. `MyTestingClass` - a custom key class with a hand-written `hashCode()` method. 
3. `MyBinarySearchTree<K, V>` - a generic binary search tree (BST) without recursion. 

Part 1: HashTable

- Insertion and retrieval methods are implemented without recursion.
- A test class inserts 10,000 random elements and prints out bucket sizes.
- Custom `hashCode()` is tuned for good uniform distribution. 

Part 2: Binary Search Tree

- Non-recursive `put()` method implemented.
- `iterator()` is supported using in-order traversal (without recursion).
- Gives access to key and value in iteration.
- Size of the tree is maintained.

To Compile and Run

Make sure all `.java` files are located in the same directory.

To compile:

```bash
javac *.java
```

To run test for hash table:

```bash
java MyHashTableTest
```

To run test for BST:

```bash
java MyBSTTest
```

Notes

- No use of built-in recursive methods will be allowed.
- The design is for educational purposes following the assignment instructions.
