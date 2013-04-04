package com.blmstrm.genericTree;

import java.util.ArrayList;

public class GenericNode{

  private ArrayList <GenericNode> childNodes;
  private GenericNode parent;
  private INodeValue value;
  private static int nrOfChildren = 0;

  public GenericNode(GenericNode p, INodeValue value){
    this.parent = p;
    this.value = value;
    this.childNodes = new ArrayList <GenericNode>();
  }

  public GenericNode(GenericNode p, INodeValue value,int numberOfChildren){
    this(p,value);
    this.nrOfChildren = numberOfChildren;
    for(int i=0;i<this.nrOfChildren;i++){
      this.childNodes.add(null);    
    }
  }

  public void addChild(INodeValue value){
    if(this.childNodes!=null){
      this.childNodes.add(new GenericNode(this,value));
    }
  }

  public void addChildAt(int pos, INodeValue value){
    if(this.childNodes!=null){
      this.childNodes.set(pos,new GenericNode(this,value));
    }
  }

  public boolean hasChildren(){
    if(this.childNodes != null){
      return (this.childNodes.size()!=0);
    }
    return false; 
  }

  public void removeChild(GenericNode child){
    if(this.childNodes!=null){
      this.childNodes.remove(child);
    }
  }

  public GenericNode getChildAt(int pos){
    if(pos < this.childNodes.size()){
      return this.childNodes.get(pos);
    }
    return null;
  }

  public GenericNode getParent(){
    return this.parent;
  }

  public INodeValue getValue(){
    if(this.value !=null){
      return this.value;
    }
    return null;
  }

  public void setValue(INodeValue value){
    this.value = value;
  }

  public int childrenCount(){
    int returnCount = 0;
    for(GenericNode node : this.childNodes){
      if(node !=null){
	returnCount++;
      }
    }
    return returnCount;
  }
}
