import com.blmstrm.genericTree.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestGenericNode{

  @Test
    public void createRootNodeTestCase(){
      GenericNode parentNode = new GenericNode(null);
      assertNull(parentNode.getParent());
    }

  @Test
    public void createChildNodeTestCase(){
      GenericNode parentNode = new GenericNode(null);
      GenericNode childNode = new GenericNode(parentNode);
      assertEquals(parentNode,childNode.getParent());
    }

  @Test
    public void addChildNodeTestCase(){
      GenericNode parentNode = new GenericNode(null);
      parentNode.addChild();
      assertTrue(parentNode.hasChildren());
    }

  @Test
    public void removeChildNodeTestCase(){
      GenericNode parentNode = new GenericNode(null);
      parentNode.addChild();
      GenericNode childToRemove = parentNode.getFirstChild();
      parentNode.removeChild(childToRemove);
      assertFalse(parentNode.hasChildren());
    }

  @Test
    public void getParentNodeTestCase(){
      GenericNode parentNode = new GenericNode(null);
      parentNode.addChild();
      GenericNode aChild = parentNode.getFirstChild(); 
      assertEquals(parentNode, aChild.getParent());
    }

  @Test
    public void setNodeValueTestCase(){
      GenericNode parentNode = new GenericNode(null);
      MockNodeValue mockValue = new MockNodeValue();
      parentNode.setValue(mockValue);
      assertEquals(parentNode.getValue(),mockValue);
    }
}
