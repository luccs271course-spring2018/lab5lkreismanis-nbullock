package edu.luc.cs271.linkedstack;

import java.util.List;
import java.util.ArrayList;
import java.util.NoSuchElementException;

public class LinkedStack<E> implements IStack<E> {

  /** The topmost node of this stack. The stack gets pushed down from here. */
  private Node<E> top;
  //Nathan
  // DONE why don't we need an explicit constructor? We do not need an explicit
  // constructor because the LinkedList ADT is already implemented.

  @Override
  public E push(final E obj) {
    // DONE
    top = new Node<>(obj, top);
    return obj;
    //return null
  }

  @Override
  public E peek() {
    // DONE
    if (isEmpty()){
      throw new NoSuchElementException (); 
    }
    else{
      return top.data;
    }
    //return null;
  }

  @Override
  public E pop() {
    // DONE
    if (isEmpty()){
      throw new NoSuchElementException();
    }
    else{
      E result = top.data;
      top = top.next;
      return result; 
    }
    //return null;
  }

  @Override
  public boolean isEmpty() {
    // DONE
    if(top != null){
    return false;
    }
  }

  @Override
  public List<E> asList(){
    // TODO implement using an ArrayList preallocated with the right size
    // TODO add any instance variable(s) required to support this
  //  int theData = new ArrayList<>();
    return null; 
  }
}
