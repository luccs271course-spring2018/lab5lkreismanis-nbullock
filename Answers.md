# Answers
## By Larisa Kreismanis and Nathan Bullock

1. Why does LinkedStack not require an explicit constructor?
- LinkedStack does not require an explicit constructor because there are methods within the program, such as the push method, that create nodes.

2. What is the time and (extra) space complexity of each of the LinkedStack methods, as well as ReverseLines.main?
- public E push(final E obj): O(1)
- public E peek(): O(1)
- public E pop(): O(1)
- public boolean isEmpty(): O(1)
- public List<E> asList(): O(1)
- ReverseLines.main: O(1)

3. How else (not using Node) could we have implemented LinkedStack in such a way that it is still based on a linked list but the asList method uses constant time and space?
- Another way we could have implemented LinkedStack in such a way that it is still based on a linked list but the asList method uses constant time and space, is to implement the use of an arrayList, which enable the use of asList.

4. Is it better for push and pop to return the item or the stack itself? Briefly discuss the pros and cons of each design.
- It is betetr for push to return the item itself and it is better for pop to return the stack itself. Push is concerned with first the object at the top of the stack and not the stack in its entirety.  In contrast, pop looks at the entire stack and determines a boolean true or false value and is not concerned with looking at individual objects in the stack.  