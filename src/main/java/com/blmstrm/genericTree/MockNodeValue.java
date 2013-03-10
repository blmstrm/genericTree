package com.blmstrm.genericTree;

public class MockNodeValue implements NodeValue{

  private int value;

  public NodeValue compareTo(NodeValue otherValue){
    return null;
  }

  public int getValue(){
    return this.value;
  }

  public void setValue(int v){
    this.value = v;
    }

}
