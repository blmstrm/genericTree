package com.blmstrm.genericTree;

import java.util.LinkedList;

public class GenericNode{

  private LinkedList <GenericNode> childNodes;
  private GenericNode parent;
  private INodeValue value;

  public GenericNode(GenericNode p){
   this.parent = p;
    this.childNodes = new LinkedList <GenericNode>();
  }

  public GenericNode addChild(){
    if(this.childNodes!=null){
      GenericNode newNode = new GenericNode(this);
      this.childNodes.add(newNode);
      return newNode;
    }
    return null;
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

  public GenericNode getFirstChild(){
    if(this.childNodes != null){
      return this.childNodes.getFirst();
    }
    return null;
  }

  public GenericNode getNextSibling(GenericNode currentNode){
    return null;
  }

  public GenericNode getParent(){
    return this.parent;
  }

  public void setValue(INodeValue v){
    this.value = v;
  }

  public INodeValue getValue(){
    if(this.value !=null){
      return this.value;
    }
    return null;
  }

  public int childrenCount(){
    return this.childNodes.size();
  }

}

