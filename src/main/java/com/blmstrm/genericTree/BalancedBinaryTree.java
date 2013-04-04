package com.blmstrm.genericTree.Trees;

import com.blmstrm.genericTree.IGenericTree;
import com.blmstrm.genericTree.*;

public class BalancedBinaryTree implements IGenericTree{

  private GenericNode root;

  public BalancedBinaryTree(){
    this.root = new GenericNode(null,null,2);
  }

  public GenericNode getRoot(){
    return this.root;
  }

  public void insertValue(INodeValue value){

    if(this.root.getValue()==null){
      this.root.setValue(value);
    }else{
      insertValueChild(this.root,value);
    }
  } 

  private void insertValueChild(GenericNode node, INodeValue value){

    boolean lesserThan = (node.getValue().compareTo(value) < 0);
    GenericNode child;

    if(lesserThan){
      if((child = node.getChildAt(0)) != null){
	insertValueChild(child,value);	
      }else{
	node.addChildAt(0,value);
      }
    }else{
      if((child = node.getChildAt(1)) != null){
	insertValueChild(child,value);	
      }else{
	node.addChildAt(1,value);
      }
    }
  }
}
