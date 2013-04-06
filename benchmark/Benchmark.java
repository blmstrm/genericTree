package com.blmstrm.genericTree.benchmark;
import com.blmstrm.genericTree.*;
import com.blmstrm.genericTree.Trees.*;
import java.util.Random;

public class Benchmark{
  public static void main(String[] args){

    BinaryTree testTree = new BinaryTree();

    NodeValue tmpValue;
    Random rnd = new Random();
    long start = System.nanoTime();
    for(int i =0;i<1000;i++){
      tmpValue = new NodeValue();
      tmpValue.setValue( new Integer(rnd.nextInt(10000)));
      testTree.insertValue(tmpValue);
    }

    System.out.println("Elapsed time for inserting 1000 items: "+ (System.nanoTime() - start));
  }
}


