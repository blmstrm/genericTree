package com.blmstrm.genericTree;

import com.blmstrm.genericTree.IGenericTree;

public class BalancedBinaryTree implements IGenericTree{

  private GenericNode parent;

  private GenericNode currentNode;

  public BalancedBinaryTree(){
    this.parent = new GenericNode(null,null);
    this.currentNode = this.parent;
  }

  public void insertValue(INodeValue value){

    switch(this.currentNode.childrenCount()){
      case 2:
	this.currentNode = this.currentNode.getFirstChild();
	System.out.println("...............Full node");	
	//Enter first child and add values 
	break;
      default:
	this.currentNode.addChild(value);
	break;
    }

  } 
}
