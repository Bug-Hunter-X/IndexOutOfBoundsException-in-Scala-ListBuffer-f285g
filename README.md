# Scala ListBuffer IndexOutOfBoundsException

This repository demonstrates a common error in Scala: the `IndexOutOfBoundsException` when working with `ListBuffer`.  The `bug.scala` file contains code that attempts to access an index beyond the list's size. The `bugSolution.scala` file shows how to avoid this error.

## Problem

Accessing elements in a `ListBuffer` using an index greater than or equal to its size will cause an `IndexOutOfBoundsException`.

## Solution

Always check the size of the `ListBuffer` before accessing an element using its index.  Consider using safe methods such as `get` which returns an `Option` to handle cases where the index is out of bounds.