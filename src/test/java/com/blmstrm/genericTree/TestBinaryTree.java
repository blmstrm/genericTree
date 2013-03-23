import com.blmstrm.genericTree.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestBinaryTree{

  @Test
  public void createTreeTestCase(){

    GenericTree binaryTree = new GenericTree(TreeType.BINARY_TREE);

    assertEquals(binaryTree.getType(),TreeType.BINARY_TREE);

  }

  @Test
  public void insertValueTestCase(){

  }



}

