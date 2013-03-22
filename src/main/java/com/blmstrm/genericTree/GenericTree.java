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
      //Binary Tree 
      case BINARY_TREE:
	switch(this.currentNode.childrenCount()){
	  case 0:break;
	  case 1: break;
	  case 2: break;
	  default:;//Throw to many children exception.
	}
	break;
      default:
    }
  } 
}
