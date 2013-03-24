package com.blmstrm.genericTree;

import java.util.LinkedList;

public class GenericNode{

  private LinkedList <GenericNode> childNodes;
  private GenericNode parent;
  private INodeValue value;

  public GenericNode(GenericNode p, INodeValue value){
    this.parent = p;
    this.value = value;
    this.childNodes = new LinkedList <GenericNode>();
  }

  public void addChild(INodeValue value){
    if(this.childNodes!=null){
      System.out.println("Adding node."); this.childNodes.addLast(new GenericNode(this,value));
      System.out.println("This:"+this.childNodes.getLast());
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

  public GenericNode getFirstChild(){
    if(this.childNodes != null){
      return this.childNodes.getFirst();
    }
    return null;
  }

  public GenericNode getNextSibling(GenericNode currentNode){
    if(this.childNodes.contains(currentNode)){
      int pos = this.childNodes.indexOf(currentNode); 
      int newPos = pos+1;
      if(newPos < this.childNodes.size()){
	return this.childNodes.get(newPos);
      }
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
    return this.childNodes.size();
  }

}
