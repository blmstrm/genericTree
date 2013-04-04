package com.blmstrm.genericTree.sample;

package com.blmstrm.genericTree.sample;
import com.blmstrm.genericTree.*;
import com.blmstrm.genericTree.Trees.*;

public static void main(String[] args){

    BalancedBinaryTree testTree = new BalancedBinaryTree();

    NodeValue tmpValue1 = new NodeValue();
    NodeValue tmpValue2 = new NodeValue();
    NodeValue tmpValue3 = new NodeValue();

    tmpValue1.setValue(new Integer(0));
    tmpValue2.setValue(new Integer(-1));
    tmpValue3.setValue(new Integer(1));

    testTree.insertValue(tmpValue1);
    testTree.insertValue(tmpValue2);
    testTree.insertValue(tmpValue3);

  }

}

