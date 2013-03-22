package com.blmstrm.genericTree;

public class GenericTree{

  private enum TreeType  { BINARY_TREE }

  private TreeType type;

  private int numberOfChildren = 0;

  private GenericNode parent;

  public GenericTree(TreeType t){

    this.parent = new GenericNode(null);

    switch(t){
      case BINARY_TREE:
	this.numberOfChildren = 2;
	this.type = t;
	break;
      default:
	//Throw Undefined three type
	System.out.println("UNDEFINED TREE TYPE");
    }
  }

  public void insertValue(INodeValue value){

    switch(this.type){
      case BINARY_TREE:
	break;
      default:
    }
  } 
}
