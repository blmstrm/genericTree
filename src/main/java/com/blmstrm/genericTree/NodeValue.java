package com.blmstrm.genericTree;

public class NodeValue implements INodeValue<Integer>{

  private Integer value;

  public NodeValue compareTo(NodeValue otherValue){
    return null;
  }

  public Integer getValue(){
    return this.value;
  }

  public void setValue(Integer v){
    this.value = v;
    }

}
