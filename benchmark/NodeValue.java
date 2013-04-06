package com.blmstrm.genericTree.benchmark;
import com.blmstrm.genericTree.*;


public class NodeValue implements INodeValue<Integer>{

  private Integer value;

  public int compareTo(INodeValue<Integer> otherValue){
    return this.value.compareTo(otherValue.getValue());
  }

  public Integer getValue(){
    return this.value;
  }

  public void setValue(Integer v){
    this.value = v;
  }

}
