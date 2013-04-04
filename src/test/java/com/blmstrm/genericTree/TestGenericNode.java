import com.blmstrm.genericTree.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestGenericNode{

  @Test
  public void createRootNodeTestCase(){
    GenericNode parentNode = new GenericNode(null,null);
    assertNull(parentNode.getParent());
  }

  @Test
  public void createChildNodeTestCase(){
    GenericNode parentNode = new GenericNode(null,null);
    GenericNode childNode = new GenericNode(parentNode,null);
    assertEquals(parentNode,childNode.getParent());
  }

  @Test
  public void addChildNodeTestCase(){
    GenericNode parentNode = new GenericNode(null,null);
    parentNode.addChild(null);
    assertTrue(parentNode.hasChildren());
  }

  @Test
  public void removeChildNodeTestCase(){
    GenericNode parentNode = new GenericNode(null,null);
    parentNode.addChild(null);
    GenericNode childToRemove = parentNode.getChildAt(0);
    parentNode.removeChild(childToRemove);
    assertFalse(parentNode.hasChildren());
  }

  @Test
  public void getParentNodeTestCase(){
    GenericNode parentNode = new GenericNode(null,null);
    parentNode.addChild(null);
    GenericNode aChild = parentNode.getChildAt(0);
    assertEquals(parentNode, aChild.getParent());
  }

  @Test
  public void setNodeValueTestCase(){
    INodeValue<?> tmpValue = new NodeValue();
    GenericNode parentNode = new GenericNode(null, tmpValue);
    assertEquals(parentNode.getValue(),tmpValue);
  }

}
