package com.blmstrm.genericTree;

public interface INodeValue<T>{

  public NodeValue compareTo(NodeValue otherValue);

  public T getValue();

  public void setValue(T v);

}
