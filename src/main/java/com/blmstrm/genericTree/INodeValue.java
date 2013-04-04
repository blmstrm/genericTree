package com.blmstrm.genericTree;

public interface INodeValue<T>{

  /*
   *Return 0 if equal
   *Return greater than 0 if this value is greater than otherValue
   *Return less than 0 if this value is less than otherValue
   */
  public int compareTo(INodeValue<T> otherValue);

  public T getValue();

  public void setValue(T v);

}
