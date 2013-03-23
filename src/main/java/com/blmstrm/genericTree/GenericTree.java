package com.blmstrm.genericTree;

public class GenericTree{

  private enum TreeType  { BINARY_TREE }

  private TreeType type;

  private int numberOfChildren = 0;

  private GenericNode parent;

  private GenericNode currentNode;

  public GenericTree(TreeType t){

    this.parent = new GenericNode(null);

    switch(t){
      case BINARY_TREE:
	this.numberOfChildren = 2;
	this.type = t;
	this.currentNode = this.parent;
	break;
      default:
	//Throw Undefined three type
	System.out.println("UNDEFINED TREE TYPE");
    }
  }

  public void insertValue(INodeValue value){

    switch(this.type){
      /*In case of a Binary tree*/
      case BINARY_TREE:
	btInsertValue(value);
	break;
      default:
    }
  } 

  /*Insert value in binary tree*/
  private void btInsertValue(INodeValue value){
    switch(this.currentNode.childrenCount()){
      case 2:
	
	//Enter first child and add values 
	break;
      default:
	this.currentNode = this.currentNode.addChild();
	this.currentNode.setValue(value);
	break;

    }


  }
}
