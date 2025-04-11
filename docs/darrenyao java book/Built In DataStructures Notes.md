# Built-in Data Structures

## Dynamic Arrays - ArrayList

### Operations

- add at the end O(1)
- delete at the end O(1)
- insert at the middle O(n)
- delete at the middle O(n)
- 

```java
ArrayList<Integer> list = new ArrayList<Integer>(); // declare the dynamic array
list.add(2); // [2]
list.add(3); // [2, 3]
list.add(7); // [2, 3, 7]
list.add(5); // [2, 3, 7, 5]
list.set(1, 4); // sets element at index 1 to 4 -> [2, 4, 7, 5]
list.remove(1); // removes element at index 1 -> [2, 7, 5]
// this remove method is O(n); to be avoided
list.add(8); // [2, 7, 5, 8]
list.remove(list.size()-1); // [2, 7, 5]
// here, we remove the element from the end of the list; this is O(1).
System.out.println(list.get(2)); // 5

```

Arrays.sort(arr) is used to sort a static array, and Collections.sort(list) a dynamic
array. The default sort function sorts the array in ascending order.

