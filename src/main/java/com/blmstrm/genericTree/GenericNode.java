import java.util.LinkedList;

public class GenericNode{

  private LinkedList <GenericNode> childNodes;
  private GenericNode parent;

  public GenericNode(GenericNode p){
    this.parent = p;
    this.childNodes = new LinkedList <GenericNode>();
  }

  public void addChild(){
    if(this.childNodes!=null){
      this.childNodes.add(new GenericNode(this));
    }
  }

  public boolean hasNoChildren(){
    if(this.childNodes != null){
      return (this.childNodes.size()>0);
    }
    return true; 
  }

  public void removeChild(GenericNode child){
    if(this.childNodes!=null){
      this.childNodes.remove(child);
    }
  }
}

