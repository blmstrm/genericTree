package com.blmstrm.genericTree;

/*TODO Leave type of NodeValue to developer*/
public interface NodeValue{

  public NodeValue compareTo(NodeValue otherValue);

  public int getValue();

  public void setValue(int v);

}
