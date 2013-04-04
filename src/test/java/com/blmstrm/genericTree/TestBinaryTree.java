import com.blmstrm.genericTree.*;
import com.blmstrm.genericTree.Trees.*;


import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class TestBinaryTree{

  @Test
  public void insertChildTestCase(){

    BinaryTree testTree = new BinaryTree();

    NodeValue tmpValue1 = new NodeValue();
    NodeValue tmpValue2 = new NodeValue();
    NodeValue tmpValue3 = new NodeValue();

    tmpValue1.setValue(0);
    tmpValue2.setValue(-1);
    tmpValue3.setValue(1);

    testTree.insertValue(tmpValue1);
    testTree.insertValue(tmpValue2);
    testTree.insertValue(tmpValue3);

    assertTrue(testTree.getRoot().childrenCount()==2);

  }

}

